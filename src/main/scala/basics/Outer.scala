package code

/**
  * Created by jcchoiling on 23/1/2017.
  */
class Outer(val name:String) {outer =>

  class Inner(val name: String){

    def foo(inner: Inner) = {
      println("Outer: " + outer.name + ", Inner: " + inner.name)
    }
  }
}

object Outer {

  def main (args: Array[String]){

    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")

    val inner1 = new outer1.Inner("Scala")
    val inner2= new outer2.Inner("Java")

    inner1.foo(inner1)
    inner2.foo(inner2)

  }
}
