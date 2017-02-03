package akka.app

import akka.actor._

/**
  * Created by jcchoiling on 2/2/2017.
  *
  * Actors should communicate by sending immutable messages between each other.
  * In this case there are four messages, and they’re defined using case objects:
  * PingMessage, PongMessage, StartMessage, and StopMessage
  *
  * 第一步：向 pingActor 发送 StartMessage
  * 第二步：PingActor 收到 StartMessage 之后打印出 "ping"，然后向 PongActor 发送 PingMessage
  * 第三步：PongActor 收到 PingMessage 之后打印出 "pong"，然后向 PingActor 发送 PongMessage
  * 第四步：PingActor 收到 PongMessage 之后打印出 "ping again"，"ping stopped"，
  *        然后向 sender(即PongActor) 发送 StopMessage，然后终止自己(即PingActor)的Actor e.g.context.stop(self)
  * 第五步：PongActor 收到 StopMessage 之后打印出 "pong stopped"，然后终止自己(即PongActor)的Actor e.g.context.stop(self)
  *
  */

case object PingMessage
case object PongMessage
case object StartMessage
case object StopMessage

class Ping(pong: ActorRef) extends Actor {

  var count = 0
  def incrementAndPrint(msg: String) {count += 1; println(msg)}

  def receive = {
    case StartMessage => //
      incrementAndPrint("ping")
      pong ! PingMessage //
    case PongMessage =>
      incrementAndPrint("ping again")
      if (count < 99){
        sender ! StopMessage // 向 PongActor 发送 StopMessage
        println("ping stopped")
        context.stop(self) // 终止自己 Actor
      } else {
        sender ! PingMessage //
      }
    case _ =>
      println("Ping got something unexpected.")

  }
}


class Pong extends Actor {

  def receive = {
    case PingMessage =>
      println(" pong")
      sender ! PongMessage  // 向 PongActor 发送 PongMessage
    case StopMessage =>
      println(" pong stopped")
      context.stop(self) // 终止自己 Actor
    case _ =>
      println("Pong got something unexpected.")
  }

}


object PingPong_ActorTest {

  def main(args: Array[String]) {

    val _system = ActorSystem("PingPongSystem")

    val pongActor = _system.actorOf(Props[Pong], name = "pong")
    val pingActor = _system.actorOf(Props(new Ping(pongActor)), name = "ping")

    pingActor ! StartMessage

    _system.terminate()


  }

}
