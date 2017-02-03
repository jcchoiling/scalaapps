package code

/**
  * Created by jcchoiling on 23/1/2017.
  */


//class Teacher {
//
//  var name: String =_
//  private var age = 27
//  private[this] val gender = "male"
//
//  def this(name: String){
//    this
//    this.name = name
//  }
//
//  def sayHello() {
//    println(this.name + " : " + this.age + " : " + this.gender)
//  }
//
//}

/**
  * 创建一个 Teacher类
  * @param name
  * @param age
  */
class Teacher(val name: String, val age: Int){

  println("This is primary constructor!!!")
  var gender: String =_

  // 创建第2个 constructor
  def this(name: String, age:Int, gender:String){
    this(name, age) // 把第一、第二个参数传入第一个构造器
    this.gender = gender // 把第三个赋值到 gender
  }
}

object OOPInScala {

  def main(arg: Array[String]) {

//    val p = new Teacher()
//    p.name = "Spark"
//    p.sayHello

    val p1 = new Teacher("Spark", 6)
    println(":" + p1.age)
    println(":" + p1.gender)

    val p2 = new Teacher("Hadoop", 11, "Male")
    println(":" + p2.age)
    println(":" + p2.gender)


  }

}
