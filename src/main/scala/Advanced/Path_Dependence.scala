package scala.Advanced

/**
  * Created by jcchoiling on 26/1/2017.
  *
  * 1) 外部类不可以访问内部类的私有成员
  * 2) 内部类可以访问外部类的私有成员
  */

class Outer{

  // 外部类不可以访问内部类的私有成员
  private val x = 10

  class Inner {
    // 内部类可以访问外部类的私有成员
    private val y = x + 10
  }

}

object Path_Dependence {

  def main(args: Array[String]): Unit = {

    val outer = new Outer
    val inner = new outer.Inner
    val inner2: outer.Inner = new outer.Inner

    val o1 = new Outer
    val o2 = new Outer

//    val i: o2.Inner = new o1.Inner // 这句语句是有问题的，因为路径依赖不同了

    /**
      * 使用不到的外部类但内部类事例是一样的
      * Outer#Inner 是 Inner 的共同类，这叫类型投影
      */
    val i: Outer#Inner = new o1.Inner // o1.Inner 是 Outer#Inner 的内部类




  }

}
