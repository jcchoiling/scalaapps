package dtspark.basics

/**
  * Created by jcchoiling on 5/2/2017.
  */
object HighOrderFunctionOps {
  def main(args: Array[String]): Unit = {

    val x = (1 to 5)  //Range(1, 2, 3, 4, 5)

    val res2 = x.reduceLeft{(a,b) => println(a + " - " + b);(a-b)}
    println(x.foldLeft(10){(a,b) => println(a + " - " + b);(a-b)})
    println(x.foldRight(10){(a,b) => println(a + " - " + b);(a-b)})

    x.collect{
      case 1 => "Scala"
      case 2 => "Spark"
    }

    x.map{
      case 1 => "Scala"
      case _ => "others"
    }

    x.map(x => println(x))

    val score = Map("Spark" -> 100, "Kafka" -> 99, "Hadoop" -> 70)
    val keys = List("Spark", "Kafka", "Hadoop")

    val scores = Map(
      "Spark" -> List(100,90,80),
      "Kafka" -> List(80,97,85),
      "Hadoop" -> List(88,92,70)
    )

    keys.map(score(_))
    keys.map(k => scores(k))
    keys.flatMap(k => scores(k))




  }

}
