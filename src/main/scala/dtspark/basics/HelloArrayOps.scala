package dtspark.basics

/**
  * Created by jcchoiling on 4/2/2017.
  */
object HelloArrayOps extends App{

  val array = Array(5) //它是固定的
  array(0) = 10

  for (item <- array) println(item)

}
