package scala.collection


/**
  * Created by jcchoiling on 30/1/2017.
  */
object ListBuffer_Queue_Stack extends App{

  def pr(msg: String): Unit = {
    println("========================")
    println(msg)
  }

  pr("Immutable Queue - First In First Out")
  val empty = scala.collection.immutable.Queue[Int]()
  val immutable_queue1 = empty.enqueue(1)
  val immutable_queue2 = immutable_queue1.enqueue(List(1,2,3,4,5))
  println(immutable_queue2)
  val (element, left) = immutable_queue2.dequeue
  println(element + " : "+ left)


  pr("Mutable Queue - First In First Out")
  val mutable_queue = scala.collection.mutable.Queue[String]()
  mutable_queue += "a"
  mutable_queue ++= List("b","c")
  println(mutable_queue)


  pr("Mutable Stack - First In Last Out")
  val mutable_stack = scala.collection.mutable.Stack[Int]()
  mutable_stack.push(1)
  mutable_stack.push(2)
  mutable_stack.push(3)
  println(mutable_stack.top)
  println(mutable_stack)
  println(mutable_stack.pop) //remove the value from the stack
  println(mutable_stack)



}
