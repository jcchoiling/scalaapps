package scala.Advanced

/**
  * Created by jcchoiling on 25/1/2017.
  */



class P[+T] (val first: T, val second: T){
  def replaceFirst[R >: T](newFirst: R) = new P[R](newFirst, second)
}

object Variant_Positions {
  def main(args: Array[String]) {

  }
}
