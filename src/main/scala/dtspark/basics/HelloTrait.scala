package dtspark.basics

/**
  * Created by jcchoiling on 4/2/2017.
  */

trait Logger {
  def log(message: String) = println("Logger: " + message)
}

trait RichLogger extends Logger{
  override def log(message: String) = println("RichLogger: " + message)
}

class Loggin(val name: String) extends Logger {

  def loggin: Unit = {
    println("Hi, Welcome ! " + name)
    log(name)
  }
}

trait Information {
  def getInformation: String
  def checkIn: Boolean = {
    getInformation.equals("Spark")
  }
}

class Passenger(val name: String) extends Information {
  override def getInformation = name
}


object HelloTrait {
  def main(args: Array[String]): Unit = {

      val x1 = new Loggin("Scala")
    x1.loggin

    println()

    val x2 = new Loggin("Kafka") with RichLogger
    x2.loggin

  }
}
