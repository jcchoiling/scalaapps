package LoggingBasic

import LoggingBasic.LoggingOps.info

/**
  * Created by jcchoiling on 19/3/2017.
  */
object LoggingOps extends StdoutLogging {

  def main(args: Array[String]): Unit = {

    for(i <- 1 to 3) call_number(i)

  }

  def call_number(i: Int): Unit ={

    println(s"This is call number $i")
    info(s"This is Info $i")


  }

}
