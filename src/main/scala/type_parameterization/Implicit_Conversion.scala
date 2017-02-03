package scala.type_parameterization

import scala.io.Source
import java.io.File


/**
  * Created by jcchoiling on 31/1/2017.
  *
  * 当我们需要某个类中特殊的方法，但这个类没有提供这么一个方法，所以我们需要隐式转换，
  * 转换成提供我们方法的一个类，然后再调用这个方法
  *
  * 第一步、首先必需有一个增长的类，E.g. RichFile 里有 read 方法
  *
  *
  */

//定义
class RichFile (val file: File) {
  def read = Source.fromFile(file.getPath()).mkString
}

object Context{
  implicit def file2RichFile(file: File) = new RichFile(file) // File -> RichFile
}



object Implicit_Conversion extends App{

  import Context.file2RichFile // 导入隐式转换方法

  println(new File("src/main/resources/people.txt").read) // 在 File 本身没有 read 方法

  1 to 3



}
