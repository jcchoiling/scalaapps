//package akka.app
//
//import akka.actor.{ActorSystem, Props}
//import akka.app.actors.{Spark, SparkFlinkActor}
//
///**
//  * Created by jcchoiling on 2/2/2017.
//  */
//
//object SparkFinkActorSystem extends App{
//
//  val _sysetm = ActorSystem("BecomeUnbecome")
//  val sparkFlinkActor = _sysetm.actorOf(Props[SparkFlinkActor], name = "sparkflinkactor")
//
//  sparkFlinkActor ! Spark
//  thread.sleep(2000)
//
//  _sysetm.terminate
//
//}
