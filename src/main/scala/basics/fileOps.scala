package code
import scala.io.Source
import java.util.Calendar

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

//    val files = Source.fromFile("src/main/resources/readme.md")

//    for (line <- files.getLines()) println(line)
//    files.getLines().foreach(println)
//    files.close

//    val webLog = Source.fromURL("http://spark.apache.org")
//    webLog.getLines().foreach(println)
//    webLog.close


//    println(getLinesFromFile("src/main/resources/words.txt"))


  }

  /**
    *
    * @param file
    * @return List
    * @example e.g. List(Orange, Apple, Pineapple, Waterlemon)
    *
    */
  def getLinesFromFile(file: String): List[String] = {
    val bufferedSource = Source.fromFile(file)
    val records = (for (line <- bufferedSource.getLines) yield line).toList
    bufferedSource.close
    records
  }

  def isFridayThirteen(cal: Calendar): Boolean = {
    val dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)
    val dayOfMonth = cal.get(Calendar.DAY_OF_MONTH)

    println(dayOfWeek)
    println(dayOfMonth)

    (dayOfWeek == Calendar.FRIDAY ) && (dayOfMonth == 13)

  }

}
