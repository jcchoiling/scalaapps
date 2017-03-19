package LoggingBasic

/**
  * Created by jcchoiling on 19/3/2017.
  */
class ServiceImportante(name: String) {

  def work(i: Int): Int = {
    println(s"Doing Important Work!: $i")
    i + 1
  }
}

object ServiceImportante extends App {

  val s1 = new ServiceImportante("s1")
  (1 to 3).foreach(x => println(s"Result: ${s1.work(x)}"))

  println("-"*100)

  val s2 = new ServiceImportante("s2") with StdoutLogging {

    override def work(i: Int): Int = {
      info(s"Starting work: i = $i")
      val result = super.work(i)
      info(s"Ending work: i = $i, result = $result")
      result
    }
  }

  (1 to 3).foreach(x => println(s"Result: ${s2.work(x)}"))

}