//package akka.app
//
//import akka.actor.{Actor, ActorSystem, Props}
//
///**
//  * Created by jcchoiling on 2/2/2017.
//  *
//  * preStart - Called right after the actor is started.
//  *            During restarts it’s called by the default implementation of postRestart.
//  *
//  * postStop - Called after an actor is stopped, it can be used to perform any needed cleanup work.
//  *            According to the Akka documentation, this hook “is guaranteed to run after message
//  *            queuing has been disabled for this actor.
//  *
//  * preRestart - According to the Akka documentation, when an actor is restarted,
//  *              the old actor is informed of the process when preRestart is called with the exception that caused the restart,
//  *              and the message that triggered the exception.
//  *              The message may be None if the restart was not caused by processing a message.
//  *
//  * postRestart - The postRestart method of the new actor is invoked with the exception that caused the restart.
//  *               In the default implementation, the preStart method is called.
//  *
//  *
//  * Akka actors are started asynchronously when they’re passed into the actorOf method using a Props
//  *
//  */
//case object ForceRestart
//
//class Kenny extends Actor {
//
//  println("entered the Kenny constructor")
//
//  override def preStart { println("kenny: preStart")}
//
//  override def postStop { println("kenny: postStop")}
//
//  override def preRestart(reason: Throwable, message: Option[Any]) {
//    println("kenny: preRestart")
//    println(s"MESSAGE: ${message.getOrElse("")}")
//    println(s" REASON: ${reason.getMessage}")
//    super.preRestart(reason, message)
//
//  }
//
//  override def postRestart(reason: Throwable) {
//    println("kenny: postRestart")
//    println(s" REASON: ${reason.getMessage}")
//    super.postRestart(reason) //call Actor.postRestart() and by default it will call the preStart()
//
//  }
//
//  def receive = {
//    case ForceRestart =>
//      throw new Exception("Boom!!")
//    case _ => println("Kenny received a message")
//
//  }
//
//}
//
//object LifecycleDemo {
//
//  def main(args: Array[String]) {
//
//    val _system = ActorSystem("LifecycleDemo")
//    val kenny = _system.actorOf(Props[Kenny], name = "Kenny")
//
//    println("sending kenny a simple String message")
//    kenny ! "hello"
//    thread.sleep(1000)
//
//    println("make kenny restart")
//    kenny ! ForceRestart
//    thread.sleep(1000)
//
//    println("stopping kenny")
//    _system.stop(kenny)
//
//    println("shutting down system")
//    _system.terminate
//
//
//  }
//
//}
