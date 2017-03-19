//package scala.Concurrent
//
//import scala.actors.Actor
//
///**
//  * Created by jcchoiling on 31/1/2017.
//  */
//
//
//object First_Actor extends Actor {
//  def act() {
//    println(thread.currentThread().getName())
//    for (i <- 1 to 10){
//      println("Steps : " + i)
//      thread.sleep(2000)
//    }
//  }
//}
//
//object Second_Actor extends Actor {
//  def act() {
//    println(thread.currentThread().getName())
//    for (i <- 1 to 10){
//      println("Steps Further: " + i)
//      thread.sleep(2000)
//    }
//  }
//}
//
//object Hello_Actor {
//
//  def main(args: Array[String]) {
//
//    println(thread.currentThread().getName())
//
//    First_Actor.start
//    Second_Actor.start
//
//  }
//
//}
