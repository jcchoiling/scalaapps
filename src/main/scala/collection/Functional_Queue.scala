package scala.collection

import scala.collection.immutable.Queue

/**
  * Created by jcchoiling on 29/1/2017.
  *
  * Function Queue is a data structure with three operations:
  * head: returns the first element of the queue
  * tail: returns a queue without its first element
  * enqueue: returns a new queue with a given element appended at the end
  *
  *
  */
object Functional_Queue extends App{

  val q = Queue(1,2,3)
  val q1 = q.enqueue(4)

  println(q)
  println(q1)

}
