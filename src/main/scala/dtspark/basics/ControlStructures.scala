package dtspark.basics

/**
  * Created by janicecheng on 3/2/2017.
  *
  * Scala 中的基本控
  */
object ControlStructures {

  def main(args: Array[String]): Unit = {

    println("Scala")

    var age = 30
    val result = if (age > 25) "Worker" else "Student" //此时因为 Worker 和 Student 都是字符串，所以 result 都是字符串
    println(result)

    // 此时因为if表达式中的else两侧一个是字符串类型、另外一个是字符串类型，所以results2的类型是它们两的公共父类 Any
    val results2 = if (age > 18) "Adult" else 1

    val results3 = if (age > 18) "Adult"



    var flag = true
//    var sum = 0
//    for (i <- 0 to 6 if flag){
//      sum = sum + i
//      if (5 == i) flag = false
//    }

//    var sum = 0
//    for (i <- 0 to 6 if flag){
//      sum = sum + i
//      if (5 == i) return
//    }
//    println("sum with return = " + sum)


    for (item <- "Hello Spark".split(" ")) println(item)

    import scala.util.control.Breaks._
    flag = true

    breakable{
      while (flag) {

        for (item <- "Spark"){
          println(item)
          if (item == "r") {
            flag = false
            break
          }

        }

      }
    }


    println("while finished!!!")


  }

}
