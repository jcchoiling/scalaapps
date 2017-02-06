package code

/**
  * Created by jcchoiling on 23/1/2017.
  *
  * class begins with the class keyword and the entire class body is inside the outermost curly braces({...})
  * The body is also the primary constructor for the class
  *
  */

class OverrideOperations

class Person(val name: String, var age: Int) {

//  println("The primary constructor of Person")

  def printValue() = println("The primary constructor of Person")

  val school = "HKU"

  def sleep = "8 hours"

  override def toString = "I am a Person"

  printValue() // 创建了一个 printValue方法，然后在构造时调用它，去确保你来创建实例时这个方法必定执行

}

class Worker(name: String, age: Int, val salary: Long)
  extends Person(name, age) {

  println("This is the subClass of Person, Primary constructor of Worker!")

  override val school = "DTSpark"

  override def toString = "I am a Worker! " + super.sleep

}

object OverrideOperations {
  def main (args: Array[String]) {

//    val w = new Worker("Spark", 5, 10000)
//
//    println("School: " + w.school)
//    println("School: " + w.salary)
//    println(w.toString())


    val p = new Person("Janice", 29)



  }
}