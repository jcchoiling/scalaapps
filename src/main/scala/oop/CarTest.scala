package oop

/**
  * Created by jcchoiling on 11/3/2017.
  */



abstract class Vehicle {
  val car = new Car("Car A")
}

class Car(val name: String) {

}

class Skyline extends Vehicle{

  val parentCar = car

}


object CarTest extends App{

  val x = new Skyline()
  val IsCar = if (x.parentCar.isInstanceOf[Car]) true else false
  println(IsCar)

}
