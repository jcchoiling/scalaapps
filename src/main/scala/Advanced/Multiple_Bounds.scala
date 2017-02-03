package scala.Advanced

/**
  * Created by jcchoiling on 25/1/2017.
  *
  * T <: A with
  * T :> A with B
  * T >: A <: B
  * T : A : B
  * T <% A <% B
  * A <:< B 表示A类型是B类型的子类
  * A =:= B 表示A类型等于B类型
  *
  *
  * T : A : B --> 必需同时是 A 和 B 类型
  *
  */


class M_A[T]
class M_B[T]

object Multiple_Bounds {

  def main(args: Array[String]): Unit = {

    implicit val a = new M_A[Int]
    implicit val b = new M_B[Int]

    def foo[T : M_A : M_B](i: T) = println("OK")

    foo(2)

    /**
      * Type Constraint
      */
    def rocky[T](i: T)(implicit ev: T <:< java.io.Serializable): Unit ={
      println("Life is Short! You need Spark!")
    }

    rocky("Spark")



  }

}
