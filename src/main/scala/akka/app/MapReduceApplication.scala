//package akka.app
//
//import akka.actor.{ActorSystem, Props}
//import akka.app.actors.MasterActor
//import akka.app.messages.Result
//
//
///**
//  * Created by janicecheng on 2/2/2017.
//  *
//  * 第一步、
//  * 第二步、创建具体的 Actor e.g. _system.actorOf(Props[MasterActor],"master")
//  *
//  * main 方法里也有一个 Actor
//  *
//  */
//object MapReduceApplication {
//
//  def main(args: Array[String]) {
//
//    val _system = ActorSystem("HelloActor")
//    val master = _system.actorOf(Props[MasterActor], name = "master") //
//
//
//    master ! "Hi My name is Janice, I'm learning Akka Actor System."
//    master ! "Akka is built from Scala. It is a concurrency programming"
//    master ! "Learning Akka, Scala, Kafka and Spark is so much fun"
//
//
//    Thread.sleep(500)
//
//    master ! new Result
//
//    Thread.sleep(500)
//
//    _system.terminate()
//
//
//  }
//
//}
