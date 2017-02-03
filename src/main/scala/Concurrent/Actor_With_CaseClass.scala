//package scala.Concurrent
//import scala.actors.Actor
//import scala.actors.Actor.{receive, _}
//
///**
//  * Created by jcchoiling on 31/1/2017.
//  *
//  * 1) 用线程作为 Actor
//  * 2) 用 case class 作为消息傅递
//  *
//  */
//
//case class Person(name: String, age: Int)
//
//class HelloActor extends Actor {
//  def act() {
//    while (true){
//      receive {
//        case Person(name,age) => {
//          println("Name: " + name + " : " + "Age: " + age)
//          sender ! "Echo!!"  // 处理好数据然后向发送者回覆数据
//        }
//        case _ => println("Something Unknown")
//      }
//    }
//  }
//}
//object Actor_With_CaseClass {
//
//  def main(args: Array[String]) {
//
//    val hiActor = new HelloActor
//    hiActor.start
//    hiActor ! Person("Spark", 6)
//
//    self.receive{case msg => println(msg)}
//    self.receiveWithin(1000){case msg => println(msg)}
//
//
//  }
//
//}
