//package akka.app.actors
//
//
//import java.util.StringTokenizer
//
//import akka.actor.{Actor, ActorRef}
//import akka.app.messages.{MapData, Word}
//
//import scala.collection.mutable.ArrayBuffer
//
///**
//  * Created by janicecheng on 2/2/2017.
//  */
//class MapActor(reduceActor: ActorRef) extends Actor{
//
//  val STOP_WORD_LIST = List("a","is")
//
//  override def receive: Receive = {
//    case msg: String =>
//      reduceActor ! evaluateExpression(msg)
//    case _ =>
//
//  }
//
//  def evaluateExpression(line: String): MapData = {
//
//    var dataList: ArrayBuffer[Word] = ArrayBuffer()
//    var parser: StringTokenizer = new StringTokenizer(line)
//
//    var defaultCount: Int = 1
//
//    while (parser.hasMoreTokens()){
//      var word: String = parser.nextToken().toLowerCase()
//      if (!STOP_WORD_LIST.contains(word)){
//        val a = new Word(word,defaultCount)
//        dataList += a
//      }
//    }
//
//    return new MapData(dataList)
//
//  }
//
//}
