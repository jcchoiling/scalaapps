package scala.type_parameterization

/**
  * Created by jcchoiling on 31/1/2017.
  */


class Pair_Implicits[T: Ordering](val first: T, val second: T){ //Ordering[T]
  def bigger(implicit ordered: Ordering[T]) =
    if (ordered.compare(first,second) > 0) first else second
}

class Pair_Implicitly[T: Ordering](val first: T, val second: T){
  def bigger = if (implicitly[Ordering[T]].compare(first,second) > 0) first else second
}

class Pair_Implicitly_Ordered[T: Ordering](val first: T, val second: T) {
  def bigger = {
    import Ordered._
    if (first > second) first else second
  }
}


object Context_Bounds_Internals {

  def main(args: Array[String]): Unit = {

    println(new Pair_Implicits(7,9).bigger)
    println(new Pair_Implicitly(7,9).bigger)
    println(new Pair_Implicitly_Ordered(7,9).bigger)


  }

}
