package scala.collection

/**
  * Created by janicecheng on 25/1/2017.
  *
  * List are immutable. Immutable linked-list
  * List are homogeneous: the elements of a list all have the same type, List[T]
  * List type in Scala is covariant. This means that for each pair of Type S and T, if S is a subtype of T,
  *   then List[S] is a subtype of List[T]. e.g. List[String] is a subtype of List[Object]
  *
  * Source Code:
  *     type List[+A] = scala.collection.immutable.List[A]
  *     val List = scala.collection.immutable.List
  *
  * Create a List:
  * val list1 = List("Programming", "Scala")
  * val list2 = "People" :: "should" :: "read" :: list1
  * val list3 = "Programming" :: "Scala" :: Nil
  * val list4 = "People" :: "should" :: "read" :: Nil
  * val list5 = list4 ++ list3
  *
  * List(1, 2, 3, 4, 5) foreach { i => println("Int: " + i) }
  *
  *
  * List function:
  * val x = List(1,2,3,4,5)
  * x.head
  * x.tail
  * x.last
  * x.init
  * x.take(2)
  * x.drop(2)
  * x.splitAt(2)
  * x.toString
  * x.mkString("")
  * x.toArray
  * x.iterator // you can call next()
  * List.range(1,5)
  * List.fill(5)('a')
  * List.concat(List('a', 'b'), List('c'))
  *
  *
  * High-Order function:
  * x.map(x => x + 1)
  * x.map(x => x.length)
  * x.map(x => x.toList.reverse.mkString)
  * x.flatMap(x => x.split(" "))
  * x.foreach(x => println(x))
  * x.filter.(_ % 2 == 0)
  * x.partition.(_ % 2 == 0)
  * x.find.(_ % 2 == 0) //Option[Int] = Some(2)
  * x.takeWhile.(_ > 0) //List[Int] = List(1, 2, 3)
  * x.dropWhile.(_ startsWith("t"))
  * x.span(_ > 0)
  *
  */
object List_FirstOrder_Ops {

  def main(args: Array[String]) {

    println(List(1,2,3,4):::List(4,5,6,7,8):::List(10,11))

    val fruit: List[String] = List("apple","orange","pears")

    val nums: List[Int]= List(1,2,3,4,5)

    val diags: List[List[Int]] =
      List(
        List(1,0,0),
        List(0,1,0),
        List(0,0,1)
      )

    val emptyList: List[Nothing] = List()

    // Because lists are covariant, it follows that List[Nothing] is a subtype of List[T] for any type T
    val list: List[String] = List()
//    val list1 :List[Nothing] =List("apple","orange","pears")  this is not allowed, because List[+A] is convariant


    List(List(1, 2), List(3), List(), List(4, 5)).flatten //res1: List[Int] = List(1, 2, 3, 4, 5)

    val a = Array("Scala","Spark")

  }

}
