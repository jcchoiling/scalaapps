package code
import scala.io.Source

/**
  * Created by jcchoiling on 23/1/2017.
  *
  * import scala.io.Source
  * val file = Source.fromFile("")
  * val webPage = Source.fromURL("")
  * val line = file.getLines() //return the Iterator[String]
  * val lines = Source.fromFile(args(0)).getLines().toList
  *
  *
  */
object fileOps {

  def main(arg: Array[String]) {

    val files = Source.fromFile("src/main/resources/readme.md")

//    for (line <- files.getLines()) println(line)
//    files.getLines().foreach(println)
//    files.close

    val webLog = Source.fromURL("http://spark.apache.org")
    webLog.getLines().foreach(println)
    webLog.close


  }
}
