package scala.Concurrent
import scala.actors.Actor
import scala.actors.Actor.{receive, _}

/**
  * Created by jcchoiling on 31/1/2017.
  *
  * receive {} 这个 PartialFunction 内部有一个 isDefineAt，判断当前消息是不是需要处理
  *
  * depreciated for scala 2.12. Only applicable up to scala 2.11.8
  *
  */

object Actor_A extends Actor {
  def act() {
    while(true){
      receive { //apply isDefineAt
        case msg => println("Message content from Actor_A: " + msg)
      }
    }
  }
}

object Actor_Messages {

  def main(args: Array[String]) {

    val actor_message = actor{

      while(true){
        receive {
          case msg => println("Message content from inbox: " + msg)
        }
      }
    }

    val double_message = actor{

      while(true){
        receive {
          case msg: Double => println("Double Number from inbox: " + msg)
          case _ => println("Something Unknown")
        }
      }
    }


    Actor_A.start
    Actor_A ! "Hadoop" //send message to Actor_A

    actor_message ! "Spark"
    double_message ! Math.PI
    double_message ! "Hadoop"


  }

}
