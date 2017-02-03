package akka.app

import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by jcchoiling on 2/2/2017.
  *
  * ActorRef has these qualities:
  * It is immutable.
  * It has a one-to-one relationship with the Actor it represents.
  * It is serializable and network-aware. This lets you pass the ActorRef around the network
  *
  */

object HelloActor extends App{

  val _system = ActorSystem("HelloAkka")
//  val helloActor = _system.actorOf(Props[HelloActor], name = "helloActor")
  val helloActor = _system.actorOf(
    Props(new HelloActor("Janice")),
    name = "helloactor") // 这里有多少参数，Actor 就会有多少参数

  helloActor ! "HELLO"
  helloActor ! "START"

  _system.terminate()

}

//class HelloActor extends Actor {
//
//  override def receive: Receive = {
//    case "hello" =>
//      println("hello back at you")
//    case "START" =>
//      println("Starting the application")
//    case _ =>
//      println("huh?")
//  }
//}

class HelloActor(myName: String) extends Actor {

  override def receive: Receive = {
    case "HELLO" =>
      println("hello back at you")
    case "START" =>
      println("Starting the application")
    case _ =>
      println("huh?")
  }
}
