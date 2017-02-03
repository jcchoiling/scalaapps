package dtspark.basics

/**
  * Created by janicecheng on 3/2/2017.
  *
  * Scala 中的基本控
  */
object ControlStructures {

  def main(args: Array[String]): Unit = {

    println("Scala")

    var age = 30
    val result = if (age > 25) "Worker" else "Student"
    println(result)

  }

}
