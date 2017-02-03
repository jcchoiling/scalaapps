package scala.collection

/**
  * Created by jcchoiling on 29/1/2017.
  *
  * There are difference types of pattern matching
  *  	  - wildcard pattern
  *  	  - constant pattern
  *  	  - varibale pattern
  *  	  - constructor pattern
  *  	  - sequence pattern
  *  	  - Tuple pattern
  *  	  - Typed pattern : m: Map[_, _]
  *  	  - pattern guard
  *
  *  sealed classes - A sealed class cannot have any new subclasses added except the ones in the same file
  *
  *
  *
  */


abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


object Pattern_Matching_Ops {
  def main(args: Array[String]): Unit = {

    def describe(expr: Expr) = (expr: @unchecked) match {
      case Var(_) => "Var()"
      case Number(_) => "Number()"
      case UnOp(_,_) => "UnOp()"
      case BinOp(_,_,_) => "BinOp()"
    }


    /**
      * Pattering match about Some and None Option[A]
      */
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
    }

    val withDefault: Option[Int] => Int = {
      case Some(x) => x
      case None => 0
    }

    println(show(capitals.get("France"))) //get method in Map() will return Some(value) or None


    val fruits = List( Some("apple"), None, Some("orange") ) // fruits: List[Option[String]] = List( Some("apple"), None, Some("orange") )
    for (Some(fruit) <- fruits) println(fruit)







  }

}
