package code

/**
  * Created by jcchoiling on 23/1/2017.
  */
object TuplePattern {

  def main(args: Array[String]) {

    val t = ("Spark","Hive", "SparkSQL")

    def tuplePattern(t: Any) = t match {

      case (one,_,_) => one
      case _ => "others"

    }

    print(tuplePattern(t))

  }

}
