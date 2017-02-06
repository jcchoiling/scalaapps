package dtspark.basics

/**
  * 1,当我们使用一个类型的使用如果当前类型无法直接找到合适的方法，则会到其伴生对象中查找隐式功能；
  * 2，如果当前类的伴生对象无法找到相关的功能，则会到该类相关的所有类和接口的伴生对象中去查找
  */

class Implicits(x: Int){
  def printValue = {
    val x = 100
    println(x)
  }
}

object Implicits {
  implicit val content = "Spark"
}

object Implicits_Msg {
  implicit val msg = "Spark Scala"
}


object ImplicitAdvanced {

  def main(args: Array[String]): Unit = {

    def printContent(implicit content: String) = println(content)

    val content = "I love Spark"

    import dtspark.basics.Implicits.content
//    import dtspark.basics.Implicits_Msg._
    printContent

  }
}
