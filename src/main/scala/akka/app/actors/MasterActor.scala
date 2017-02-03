//package akka.app.actors
//
//import akka.actor.{Actor, ActorRef, Props}
//import akka.app.messages.Result
//
///**
//  * Created by janicecheng on 2/2/2017.
//  *
//  * Extend the abstract class and create some Actor
//  *
//  *
//  *
//  */
//class MasterActor extends Actor {
//
//  /**
//    * Create different actors
//    */
//
//  val aggregateActor: ActorRef = context.actorOf(Props[AggregateActor], "aggregate")
//  val reduceActor: ActorRef = context.actorOf(Props(new ReduceActor(aggregateActor)), name = "reduce")
//  val mapActor: ActorRef = context.actorOf(Props(new MapActor(reduceActor)), name = "map")
//
//
//  override def receive: Receive = {
//    case msg: String =>
//      mapActor ! msg
//    case msg: Result =>
//      aggregateActor ! msg
//    case _ =>
//  }
//
//
//}
