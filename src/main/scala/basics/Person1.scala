package code

/**
  * Created by jcchoiling on 23/1/2017.
  */

case class Person1(name: String, age: Int)

object ConstructorPerson {

  def main(args: Array[String]) {

    val p = new Person1("Janice", 29)

    def constructorPattern(p: Person1) = p match {

      case Person1(name, age) => "name: " + name + "age: " + age
      case _ => "other"

    }

    println(constructorPattern(p))

  }

}
