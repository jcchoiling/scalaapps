package scala.collection

/**
  * Created by jcchoiling on 31/1/2017.
  */


case class Person(firstName: String, lastName: String)
case class Dog(name: String)

object Match_Expression extends App {

  def pattern_match(x: Any): String = x match {

    //constant patterns
    case 0 => "zero"
    case true => "true"
    case "hello" => "you said hello"
    case Nil => "an empty List"

    //sequence patterns
    case List(0,_,_) => "a three-element list with 0 as the first element"
    case List(1,_*) => "a list begin with 1, having any number of elements"
    case Vector(1,_*) => "a vector starting with 1, having any number of elements"

    //tuple
    case (a,b) => s"got $a and $b"
    case (a,b,c) => s"got $a and $b and $c"


    //constructor patterns
    case Person(first, "Alexander") => s"found an Alexander, first name = $first"
    case Dog("Lucky") => "found a dog named Lucky"


    //typed patterns
    case s: String => s"you gave me this string: $s"
    case i: Int => s"thanks for the int: $i"
    case f: Float => s"thanks for the float: $f"
    case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
    case as: Array[String] => s"an array of string: ${as.mkString(",")}"
    case d: Dog => s"dog: ${d.name}"
    case list: List[_] => s"thanks for the List: $list"
    case m: Map[_, _] => s"thanks for the Map: ${m.toString}"


    //the default wildcard pattern
    case _ => "Unknown"


  }

  println("-----constant patterns-----")
  println(pattern_match(0))
  println(pattern_match(true))
  println(pattern_match("hello"))
  println(pattern_match(Nil))

  println("-----sequence patterns-----")
  println(pattern_match(List(0,1,2)))
  println(pattern_match(List(1,1,2,3,4,5,6)))
  println(pattern_match(Vector(1,2,3)))

  println("-----tuple patterns-----")
  println(pattern_match((1,2)))
  println(pattern_match((1,2,3)))

  println("-----constructor patterns-----")
  println(pattern_match(Person("Melissa", "Alexander")))
  println(pattern_match(Dog("Lucky")))

  println("-----typed patterns-----")
  println(pattern_match("ScalaInAction"))
  println(pattern_match(100))
  println(pattern_match(100F))
  println(pattern_match(Array(11,22,33,44)))
  println(pattern_match(Array("Scala","Spark","Hadoop")))
  println(pattern_match(Dog("Lunar")))
  println(pattern_match(List("apple","orange","pineapple")))
  println(pattern_match(Map("Scala" -> 6, "Spark" -> 5, "Kafka" -> 4)))




}
