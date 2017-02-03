package scala.type_parameterization
import java.io.File
import scala.io.Source


/**
  * Created by jcchoiling on 31/1/2017.
  */


class RichFile2 (val file: File) {
  def read = Source.fromFile(file.getPath()).mkString
}

class File_Implicits(path: String) extends File(path)
object File_Implicits {
  implicit def file2RichFile(file: File) = new RichFile2(file) // File -> RichFile
}

object Implicits_Internal extends App{

  // 看看 File_Implicits 的伴身对象有没有隐式转换
  println(new File_Implicits("src/main/resources/people.txt").read)

}
