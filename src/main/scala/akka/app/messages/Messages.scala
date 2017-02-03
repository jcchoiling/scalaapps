package akka.app.messages
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.HashMap

/**
  * Created by janicecheng on 2/2/2017.
  */

class Word(word: String, count: Integer) //will send the word message to MapActor

case class Result() // send the data to the aggregate actor

class MapData(val dataList: ArrayBuffer[Word])

class ReduceData(val reduceDataMap: HashMap[String, Int])
