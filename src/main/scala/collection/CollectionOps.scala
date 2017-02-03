package scala.collection

/**
  * Created by janicecheng on 27/1/2017.
  *
  * A method call should not have any side effect. A method's only act should be to compute and return a value.
  * Array is a mutable obejct while List is an immutable object
  *
  *
  *  object Demo {
  *     def map[A, B](xs: List[A], f: A => B): List[B] =
  *         for (x <- xs) yield f(x)
  *     def flatMap[A, B](xs: List[A], f: A => List[B]): List[B] =
  *         for (x <- xs; y <- f(x)) yield y
  *     def filter[A](xs: List[A], p: A => Boolean): List[A] =
  *         for (x <- xs if p(x)) yield x
  * }
  *
  * List - function
  * val x = List(1,2,3,4,5,6,7,8,9)
  *
  * x.drop(2)
  * x.dropRight(2)
  * x.exists(s => s.length == 2)
  * x.filter(s => s.length == 2)
  * x.foreach(s => println(s))
  * x.head()
  * x.tail()
  * x.isEmpty()
  * x.last()
  * x.length()
  * x.map( s => s + "y")
  * x.reverse()
  * x.sort()
  *
  *
  *
  * Set - function, inherit from
  * scala.collection
  * scala.collection.immutable - Set - HashSet
  * scala.collection.mutable - Set - HashSet
  *
  * val x = (1,2)
  * x.contains("Scala")
  * x += "Spark"
  *
  *
  *
  *
  */
object CollectionOps {

  def main(args: Array[String]): Unit = {


    /**
      * Map
      */
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital)

    import scala.collection.mutable
    val treasureMap = mutable.Map[Int,String]()
    treasureMap += (1 -> "Got to Island")
    treasureMap += (2 -> "Finding big X on the ground")
    treasureMap += (3 -> "Dig")

//    stateCapitals foreach { case (k, v) => println(k + ": " + v) }
    println(treasureMap(2))

    /**
      * Array
      */
    // this is calling the Array.apply("zero", "one", "two") method
    // val numNames: Array[String] = new Array[String](3)
    val numNames = Array("zero", "one", "two")

    /**
      * List
      */
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    val twoThree = List(1,2)
    val oneTwoThree = 1 :: twoThree // a value of 1 is appended to the List()

    val fruit = "apple" :: "orange" :: "pineapple" :: Nil
    print(fruit)


    /**
      * Tuple
      */
    val pair = (99, "Scala") // this is a Tuple2[Int,String] type
    val t1: (Int, Char) = (1,'a')
    val t2: (Int, Char) = Tuple2[Int,Char](1,'a')
    val f1: Int => Int = _ + 2


    /**
      * Set
      */
    var jetSet = Set("Boeing","Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    import scala.collection.mutable

    val movieSet = mutable.Set("Hitch","Poltergeist")
    movieSet += "Shrek"
    println(movieSet)


    import scala.collection.immutable.HashSet
    val hashSet = HashSet("Tomatoes","Chilies")
    println(hashSet + "Coriander")


    val t = Traversable(1, 2, 3)



  }

}
