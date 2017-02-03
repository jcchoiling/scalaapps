//package akka.app.actors
//
//import scala.collection.immutable.HashMap
//
//import akka.actor.{Actor, ActorRef}
//import akka.app.messages.{MapData, ReduceData, Word}
//
//import scala.collection.mutable.ArrayBuffer
//
///**
//  * Created by janicecheng on 2/2/2017.
//  */
//class ReduceActor(aggregateActor: ActorRef) extends Actor{
//
//
//
//  override def receive: Receive = {
//    case msg: MapData =>
//      aggregateActor ! reduce(msg.dataList)
//    case _ =>
//  }
//
//  def reduce(dataList: ArrayBuffer[Word]): ReduceData = {
//    val reduceMap = new HashMap[String, Int]
//
//    for (wc: Word <- dataList){
//      var word: String = "1"
//      if (reduceMap.contains(word)){
//        reduceMap.put(word, reduceMap.get(word) + 1)
//      } else {
//        reduceMap.put(word, 1)
//      }
//    }
//
//    return new ReduceData(reduceMap)
//  }
//
//
//
//
//
//}
