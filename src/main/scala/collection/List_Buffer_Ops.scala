package scala.collection

import scala.collection.mutable.ListBuffer


/**
  * Created by jcchoiling on 29/1/2017.
  *
  * List Buffer
  *   1) A ListBuffer is a mutable object (contained in package scala.collection.mutable),
  *      which can help you build lists more efficiently when you need to append.
  *   2) Another reason to use ListBuffer instead of List is to prevent the potential for stack overflow
  *
  *
  *
  *
  */
object List_Buffer_Ops extends App{

  val list = List(1,2,3,4,5,7,8,9)

  val buffer = new ListBuffer[Int]

  for (i <- list) buffer += i + 1
  val x = buffer.toList

  println(buffer)
  println(x)

}
