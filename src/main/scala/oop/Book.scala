package scala.oop

/**
  * Created by jcchoiling on 30/1/2017.
  */

case class Book (var title: String, var numberOfPages: Int)

object Book extends App{

  val bookTitle = "Beginning Scala"
  println(s"Book Title is ${ bookTitle}")

}

