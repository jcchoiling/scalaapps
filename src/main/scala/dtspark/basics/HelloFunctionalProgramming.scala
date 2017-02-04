package dtspark.basics

/**
  * Created by jcchoiling on 3/2/2017.
  */

object HelloFunctionalProgramming {
  def main(args: Array[String]): Unit = {

    hello("Spark", 23)
    hello("Scala")

    println("Sum: " + sum(1,2,3,4,5,6,7))
    println("Sum: " + sum(1 to 100: _*))
    println("Sum: " + sumRecursive(1 to 100: _*))

  }


  def hello(name: String, age: Int = 30) = {
    println("Hello my name is " + name)
    println("Hello my age is " + age)
  }

  def sum(numbers: Int*): Int ={
    var result = 0
    for (number <- numbers) result += number

    result
  }

  def sumRecursive(numbers: Int*): Int ={
    if (0 == numbers.length) 0
    else numbers.head + sumRecursive(numbers.tail: _*)
  }


}
