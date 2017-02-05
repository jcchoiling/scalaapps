package dtspark.basics

/**
  * Created by jcchoiling on 5/2/2017.
  *
  *
  * def orElse[A1 <: A, B1 >: B](that: PartialFunction[A1, B1]): PartialFunction[A1, B1] =
  *     new OrElse[A1, B1] (this, that)
  *
  *
  * https://twitter.github.io/scala_school/pattern-matching-and-functional-composition.html
  *
  * A function works for every argument of the defined type.In other words, a function defined as (Int) => String takes any Int and returns a String.
  * A Partial Function is only defined for certain values of the defined type. A Partial Function (Int) => String might not accept every Int.
  * isDefinedAt is a method on PartialFunction that can be used to determine if the PartialFunction will accept a given argument.
  *
  * trait Publisher[T] {
  * def subscribe(f: PartialFunction[T, Unit])
  * }
  *
  * val publisher: Publisher[Int] = ...
  * publisher.subscribe {
  *   case i if isPrime(i) => println("found prime", i)
  *   case i if i%2 == 0 => count += 2
  *   /* ignore the rest */
  * }
  *
  */




object HelloPartialFunction extends App {

  val sample = 1 to 10
  val isEven: PartialFunction[Int, String] = {
    case x if x % 2 == 0 => x + " is even"
  }
  val evenNumbers = sample.collect(isEven)
//  evenNumbers.foreach(println)


  println(evenNumbers)
  println(evenNumbers.lift(0))
  println(evenNumbers.lift(1))
  println(evenNumbers.lift(2))
  println(evenNumbers.lift(3))
  println(evenNumbers.lift(4))

//  val isOdd: PartialFunction[Int, String] = {
//    case x if x % 2 == 1 => x + " is odd"
//  }
//  val numbers = sample.map(isEven orElse isOdd)
//  numbers.foreach(println)


}
