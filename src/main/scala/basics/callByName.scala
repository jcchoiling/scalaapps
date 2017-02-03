package code

/**
  * Created by jcchoiling on 24/1/2017.
  * 第一步调用 delayed()，打印出 println("In delayed method")
  * 第二步打印 println("Param: " + t) 时，因为这句有 t 所以调用了 time()
  * 第三步调用 time()，打印出 println("Getting time in nano seconds")
  * 第四步把 time() 方法的返回值返回到 println("Param: " + t) 的 t
  *
  * 运行结果:
  * In delayed method
  * Getting time in nano seconds
  * Param: 2056610254508
  */
object callByName {
  def main(args: Array[String]): Unit = {

    delayed(time())

  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }


  def delayed(t: => Long) = {

    println("In delayed method")
    println("Param: " + t)

  }

}
