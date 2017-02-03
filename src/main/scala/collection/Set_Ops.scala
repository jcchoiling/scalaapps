package scala.collection


/**
  * Created by jcchoiling on 29/1/2017.
  *
  * empty Set
  * empty Map
  * TreeSet
  * TreeMap
  *
  *
  *
  */
object Set_Ops extends App{

  val text = "See Spot run. Run, Spot. Run!"
  val wordsArray = text.split("[ !,.]+")
  val words = mutable.Set.empty[String]

  val people = Set("Nancy", "Jane")
  val s = Set(1,2,3)

  val map = mutable.Map.empty[String, Int]
  map("hello") = 1
  map("there") = 2


}
