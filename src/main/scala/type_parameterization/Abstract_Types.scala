package scala.type_parameterization

import scala.io.BufferedSource
import scala.io.Source

/**
  * Created by jcchoiling on 31/1/2017.
  */

// 抽象
trait Reader {
  type In <: java.io.Serializable
  type Contents //这个是抽象类型

  def read(in: In): Contents
}

// 实现具体 Reader 可以有很多子类，
class FileReader extends Reader {
  type In = String
  type Contents = BufferedSource

  def read(name: In) = Source.fromFile(name)
}


object Abstract_Types {

  def main(args: Array[String]) {

    val dataPath = "src/main/resources/readme.md"
    val fileReader = new FileReader
    val content = fileReader.read(dataPath) // Source.fromFile("src/main/resources/readme.md")
    for (line <- content.getLines()) {
      println(line)
    }

  }

}
