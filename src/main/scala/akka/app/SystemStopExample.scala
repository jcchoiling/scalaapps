package akka.app

import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by jcchoiling on 3/2/2017.
  */
class TestActor extends Actor {
  def receive = {
  case _ =>
    println("a message was received") }
}

object SystemStopExample extends App{
  val actorSystem = ActorSystem("SystemStopExample")
  val actor = actorSystem.actorOf(Props[TestActor], name = "test")

  actor ! "hello"

  // stop our actor
  actorSystem.stop(actor)
  actorSystem.shutdown

}
