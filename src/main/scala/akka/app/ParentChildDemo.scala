package akka.app

import akka.actor.{Actor, ActorSystem, PoisonPill, Props}

/**
  * Created by jcchoiling on 3/2/2017.
  *
  * Akka actors are started asynchronously when they’re passed into the actorOf method using a Props.
  * At the ActorSystem level of your application, you create actors by calling the system.actorOf method.
  * Within an actor, you create a child actor by calling the context.actorOf method
  *
  * path: akka://ParentChildDemo/user/parent/Fred
  * path: akka://ParentChildDemo/user/parent/Fredrick
  *
  * Actor Level: Root -> Master(Parent) -> Worker(Child)
  *
  */


case class CreateChild (name: String)
case class Name (name: String)

class Worker extends Actor {

  var name = "No name"

  override def postStop() = {println(s"D'oh! They killed me ($name): ${self.path}")}

  def receive = {
    case Name(name) =>
      this.name = name
    case _ =>
      println(s"Child $name got message")
  }

}


class Master extends Actor {

  def receive = {
    case CreateChild(name) =>
      println(s"Parent about to create Child ($name) ...")
      val workerActor = context.actorOf(Props[Worker], name = s"$name") // create worker(child) level Actor
      workerActor ! Name(name)
    case _ =>
      println(s"Parent got some other message.")
  }

}

object ParentChildDemo {
  def main(args: Array[String]){

    val _system = ActorSystem("ParentChildDemo") // create root level Actor
    val masterActor = _system.actorOf(Props[Master], name="master") // create master(parent) level Actor

    masterActor ! CreateChild("Fred")
    masterActor ! CreateChild("Fredrick")
    Thread.sleep(500)

    println("Sending Fredrick a PoisonPill ...")
    val fredrick = _system.actorSelection("/user/Master/Fredrick") //look up actors with the actorSelection
    fredrick ! PoisonPill
    println("fredrick was killed")

    Thread.sleep(5000)
    _system.terminate

  }
}
