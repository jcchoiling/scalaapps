//package akka.app.actors
//
//import scala.collection.immutable.HashMap
//
//import akka.actor.{Actor}
//import akka.app.messages.{ReduceData, Result}
//
//
///**
//  * Created by janicecheng on 2/2/2017.
//  */
//class AggregateActor extends Actor{
//
//  val finalReducedMap = new HashMap[String, Int]
//
//  override def receive: Receive = {
//    case msg: ReduceData =>
//      aggregrateInMemoryReduce(msg.reduceDataMap)
//    case msg: Result =>
//      println(finalReducedMap.toString)
//  }
//
//
//  def aggregrateInMemoryReduce(reducedList: HashMap[String, Int]) {
//
//    var count: Integer = 0
//
//    for (key <- reducedList){
//      if (finalReducedMap.containsKey(key)){
//        count = reducedList.get(key)
//        count += finalReducedMap.get(key)
//        finalReducedMap.put(key, count)
//      } else {
//        finalReducedMap.put(key, reducedList.get(key))
//      }
//    }
//
//
//  }
//
//
//
//
//}
