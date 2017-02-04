package dtspark.basics

/**
  * Created by jcchoiling on 4/2/2017.
  */

class Person(val name: String) {
  def swim() = println(s"$name[Person] swim")
}

class Student (name: String) extends Person(name) {
  def swim(x: String) = println(s"$name[Student] swim: $x")
//  override def swim() = println(s"$name[Student] swim")
}


object InherienceOps extends App{

  val p1: Person = new Person("Janice") //调用了 Person 类型的 swim
  p1.swim()

  val s1: Student = new Student("Peter") // 调用了 Student 类型的 swim
  s1.swim()
  s1.swim("Butterfly")
//  s1.asInstanceOf[Person].swim("Butterfly")  //compile Error

  val ps: Person = new Student("Moses") // 调用了 Person 类型的 swim
  ps.swim()
//  ps.swim("Butterfly") //compile Error


  println("-" * 100)

  if (s1.isInstanceOf[Person]){
    val p2 = s1.asInstanceOf[Person] // 强制转换成父类
    p2.swim()
    println(p2.getClass) // 虽然强制转换成父类，但他的真实身份依然是子类 Student
//    p2.swim("Butterfly") //compile Error // 强制转换成父类不能调用子类的类型
  }


}
