package type_parameterization
//import scala.reflect.runtime.universe._

/**
  * Created by jcchoiling on 4/2/2017.
  */

class Spark
trait Hadoop
object Flink

class Java {
  class Scala
}

object Type_Advanced {

  def main(args: Array[String]): Unit = {

    val spark = new Spark

//    println(typeOf[Spark])
    println(classOf[Spark]) // Class[_ <: Spark] classOf 是获取它类型本身
    println(spark.getClass)

    println(Flink.getClass) //class type_parameterization.Flink$ 对象才可以调用 getClass
//    println(classOf[Flink])

  }

}
