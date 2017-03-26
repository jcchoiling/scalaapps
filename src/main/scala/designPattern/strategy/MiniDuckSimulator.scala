package designPattern.strategy

/**
  * Created by jcchoiling on 24/3/2017.
  *
  * Design Pattern: This is called StrategyPattern. Strategy Pattern defines a family of alogrithms, encapsulates each one,
  * and makes them interchangeable. Strategy lets the alogrithm vary independently from clients that use it.
  */
object MiniDuckSimulator {

  def main(args: Array[String]): Unit = {

    val mallard: Duck = new MallardDuck()
    mallard.performFly() //MallardDuck
    mallard.performQuack()

    val model: Duck = new ModelDuck()
    model.performFly()
    model.setFlyBehavior(new FlyRocketPowered())
    model.performFly()

  }

}
