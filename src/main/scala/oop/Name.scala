package scala.oop

/**
  * Created by jcchoiling on 30/1/2017.
  *
  * class Name(s: String) {
  *
  *   private var _value: String = s //Invisible field, declared mutable in this case.
  *
  *   def value: String = _value //The “getter” or reader method.
  *
  *   def value_=(newValue: String): Unit = _value = newValue //The “setter” or writer method.
  *
  * }
  *
  */

class Name(var value: Int) {
  require(value != 0)
}


object Name extends App {


  def apply(value: Int): Name = new Name(value) //works with n2

  val n1 = new Name(1)
  val n2 = Name(2) //call the apply method

  println(n1.value)
  println(n2.value)

}