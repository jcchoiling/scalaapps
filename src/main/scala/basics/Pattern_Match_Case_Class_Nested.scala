package code

/**
  * Created by janicecheng on 24/1/2017.
  */

abstract class Item
case class Book(description: String, price: Double) extends Item
case class Bundle(description: String, price: Double, item: Item*) extends Item

object Pattern_Match_Case_Class_Nested {

  def main(args: Array[String]): Unit = {

    def caseclass_nested(x: Item) = x match {

      case Bundle(_, _, art @ Book(_,_), rest @ _*) => println(art.description + " : " + art.price)
      case Bundle(_, _,Book(desc, _), _*) => println("The first description is :" + desc)
      case _ => println("Opps")

    }

    caseclass_nested(Bundle("11111 Spark", 30.0,
      Book("Scala for Spark Developer", 69.95),
      Bundle("Hadoop", 40.0,
        Book("Programming Hive", 79.95),
        Book("Programming Hadoop", 32.95)
      )
    ))


    caseclass_nested(Bundle("111111 Special", 35.0, Book("Spark for Impatient", 39.95)))


  }

}
