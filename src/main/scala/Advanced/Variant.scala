package scala.Advanced

/**
  * Created by janicecheng on 26/1/2017.
  */


class Base {
  var i = 10
}

class Sub extends Base

object Variant {

  def main(args: Array[String]): Unit = {

    def increment[B <: Base](b: Base) = { // increment 函數接收一个不大于 Base 类型的
      b.i += 1
      b
    }

    val l: List[Base] = List[Sub]()
    val base = new Base()

    println(base.i) //results: 10
    println(increment(base)) // b increment 1 for every call
    println(base.i) //results: 11


  }

}
