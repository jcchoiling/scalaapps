package dtspark.basics

import scala.actors.Actor

/**
  * Created by jcchoiling on 5/2/2017.
  */
object HelloActor {
  def main(args: Array[String]): Unit = {

    val actorA = new ActorA
    actorA.start()

    val actorB = new ActorB(actorA)
    actorB.start()

//    var counter = 0
//    while (true){
//      actorA ! "Wow" + counter
//      counter += 1
//
//      Thread.sleep(1000)
//    }

//    actorA ! Hello("Spark", "Spark means Dollar")


  }
}

case class Hello(name: String, content: String, sender: Actor)
case class HelloBack(name: String, content: String, sender: Actor)

class ActorA extends Actor{

  var counter = 0

  def act() {
    while (true){
      receive {
        case content: String => println("Message: " + content)
        case Hello(name, content, sender) => {
          println("["+ counter +"] " + "ActorA : " + name + " : " + content)
          counter += 1
          Thread.sleep(1000)

          sender ! HelloBack(name, content, this)
        }
      }
    }
  }
}

class ActorB(val helloActor: Actor) extends Actor{

  var counter = 0

  def act() {

    helloActor ! Hello("Spark", "Love is here", this)

    while (true){
      receive {
        case content: String => println("Message: " + content)
        case HelloBack(name, content, sender) => {
          println("["+ counter +"] " + "ActorB : " + name + " : " + content)
          counter += 1
          Thread.sleep(1000)

          sender ! Hello(name, content, this)
        }
      }
    }
  }
}