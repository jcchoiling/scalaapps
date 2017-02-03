package scala.Advanced

/**
  * Created by jcchoiling on 27/1/2017.
  *
  */

class Car {override def toString = "Car()"}
class Volvo extends Car {override def toString = "Volvo()"}
class VolvoWagon extends Volvo {override def toString = "VolvoWagon()"}


//case class Item[A](a: A){def get: A = a}
class Item[+A](a: A) {def get: A = a}
class Check[-A] {def check(a: A) = {}}


object Type_Variance extends App{

  def item(v: Item[Volvo]) {val c: Car = v.get } // Car是父类，Volvo是子类, 允许 Car类 和 Volvo类
  def check(v: Check[Volvo]) { v.check(new VolvoWagon()) }  //Reference to check(a: A)



  /**
    * This is Scala's polymorphism, allowing lower types to be stored in values with higher types.
    * 小类型可以放在大类型的容器上
    */

  val c1: Car = new Volvo() // Car是父类，Volvo是子类，默认是可以将子类放进父类中

  val c2: Item[Car] = new Item[Volvo](new Volvo()) // Car是父类，Volvo是子类
  val c3: Item[Car] = new Item[Car](new Car())
  val c4: Item[Volvo] = new Item[VolvoWagon](new VolvoWagon()) // Volvo是父类，VolvoWagon是子类

   val c5: Check[Car] = new Check[Car]
//   val c6: Check[Car] = new Check[Volvo] // Compile Error - Car是父类，Volvo是子类
  val c8: Check[Volvo] = new Check[Car]
//  val c9: Check[Volvo] = new Check[VolvoWagon] // Compile Error - Volvo是父类，VolvoWagon是子类
  val c10: Check[VolvoWagon] = new Check[Car]
  val c11: Check[VolvoWagon] = new Check[Volvo] //Volvo是父类，VolvoWagon是子类


//  item(new Item[Car](new Car())) // Compile Error
  item(new Item[Volvo](new Volvo()))
  item(new Item[VolvoWagon](new VolvoWagon()))

  check(new Check[Car])
  check(new Check[Volvo])
//  check(new Check[VolvoWagon]) // Compile Error

}
