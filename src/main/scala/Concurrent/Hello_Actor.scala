package scala.Concurrent

import scala.actors.Actor

/**
  * Created by jcchoiling on 31/1/2017.
  */


object First_Actor extends Actor {
  def act() {
    println(Thread.currentThread().getName())
    for (i <- 1 to 10){
      println("Steps : " + i)
      Thread.sleep(2000)
    }
  }
}

object Second_Actor extends Actor {
  def act() {
    println(Thread.currentThread().getName())
    for (i <- 1 to 10){
      println("Steps Further: " + i)
      Thread.sleep(2000)
    }
  }
}

object Hello_Actor {

  def main(args: Array[String]) {

    println(Thread.currentThread().getName())

    First_Actor.start
    Second_Actor.start

  }

}
