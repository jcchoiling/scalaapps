package scala.type_parameterization
import java.io.File
import scala.io.Source

/**
  * Created by jcchoiling on 31/1/2017.
  */

object Context_Helper {

  implicit class FileEnhancer(file: File){
    def read = Source.fromFile(file.getPath).mkString
  }

  implicit class Op(x: Int){
    def addX(num: Int) = x + num
  }

}

object Implicits_Class {

  def main(args: Array[String]): Unit = {

    import Context_Helper._
    println(1.addX(2))
    println(new File("src/main/resources/people.txt").read)


  }

}
