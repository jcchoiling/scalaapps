package scala.Advanced

/**
  * Created by jcchoiling on 25/1/2017.
  */


class Person

class Student extends Person

class C[+T] (val args: T) //聲明它有
//class S[+T](arg: T) extends C[T](agr)

trait Friend[-T]{ //
  def makeFriend(somebody: T)
}

object Variance {

  def makeFriendsWithYou(s: Student, f:Friend[Student]) {f.makeFriend(s)}

  def main(args: Array[String]): Unit = {

    val value: C[Person] = new C[Student](new Student)

    val list: List[_ <: Any] = List[String]("Spark")

  }

}
