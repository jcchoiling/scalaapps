package scala.Advanced

import scala.reflect.ClassTag


/**
  * Created by jcchoiling on 25/1/2017.
  *
  * ClassTag 是最常用的，它是在运行时指定在编译时无法确定的类型，因为平身是泛型，泛型在运行的时候必需有指定的类型传给 JVM
  */

class A[T]

object Manifest_ClassTag {

  def main(args: Array[String]): Unit = {
    /**/
    def arrayMake[T: Manifest](first: T, second: T) = {
      val r = new Array[T](2)
      r(0) = first
      r(1) = second
      r
    }

    arrayMake(1,2).foreach(println)

    def mkArray[T: ClassTag](elems: T*) = Array[T](elems: _*)

    mkArray(42,13).foreach(println)
    mkArray("Japan","Brazil","Germany").foreach(println)


    def manif[T](x: List[T])(implicit m: Manifest[T]) = {
      if (m <:< manifest[String])
        println("List String")
      else
        println("Some other type")
    }

    manif(List("Spark", "Hadoop"))
    manif(List(1,2))
    manif(List("Scala",3))

    val m = manifest[A[String]]
    println(m)

    val cm = classManifest[A[String]]
    println(cm)

  }

}
