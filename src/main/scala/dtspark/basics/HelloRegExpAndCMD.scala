package dtspark.basics
import sys.process._

/**
  * Created by jcchoiling on 5/2/2017.
  */
object HelloRegExpAndCMD {
  def main(args: Array[String]): Unit = {
//    "java /Users/jcchoiling/IdeaProjects/scalaapps/src/main/scala/dtspark/basics/HelloJava" !

//    val pattern = "[a-z]+".r

    val pattern = "[0-9]+".r

//    println(pattern.findFirstIn("spark is cool"))
    val s1 = pattern.findAllIn("spark is cool")
    for (i <- s1) println(i)

    val result = pattern.findFirstIn("Hello, Life is short,you need spark 1111")
    println(result)
  }
}
