package code

/**
  * Created by janicecheng on 24/1/2017.
  * case class 和 case object 有主要的两个用途，第一个是转送消息，第二个是模式匹配
  * case class 中默应是 val，是不可变的，
  *
  * 每创建一个 case class, scala 内部会自动生成以下六个方法:
  * 1) apply
  * 2) copy
  * 3) equals
  * 4) hashCode
  * 5) toString
  * 6) unapply: 可以用 pattern matching
  *
  */


abstract class Person2
case class Student2(age: Int) extends Person2
case class Worker2(age: Int, salary: Double) extends Person2
case object Shared extends Person2 // 如果要用全球唯一的对象

object case_class_object {

  def main(args: Array[String]) {


    def caseOps(person: Person2) = person match {

      case Student2(age) => println("I am " + age + " years old")
      case Worker2(_, salary) => println("worker")
      case Shared => println("Shared")
      case _ => println("others")

    }

    caseOps(Student2(19))
    caseOps(Shared)


    val worker = Worker2(29,10058.253)
    val worker2 = worker.copy(salary = 19.95)
    val worker3 = worker.copy(age = 30)

  }

}
