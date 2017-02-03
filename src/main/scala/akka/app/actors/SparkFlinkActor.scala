package akka.app.actors

import akka.actor.Actor

/**
  * Created by jcchoiling on 2/2/2017.
  */

case class Spark()
case class Flink()

class SparkFlinkActor extends Actor{

  import context._
  var count = 0

  override def receive: Receive = {

    case Spark =>
      println("Here is Spark!!!")
      count += 1
      Thread.sleep(100)
      self ! Flink // send a message to myself SparkFlinkActor
      become {
        case Flink =>
          print("Here is Flink!!! ")
          count += 1
          Thread.sleep(100)
          self ! Spark
          unbecome()
      }
      if (count > 10) context.stop(self)
  }

}
