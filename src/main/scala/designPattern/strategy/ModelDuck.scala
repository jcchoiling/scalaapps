package designPattern.strategy

/**
  * Created by jcchoiling on 24/3/2017.
  */
class ModelDuck extends Duck{

  println("---ModelDuck---")

  override var flyBehavior: FlyingBehaviors = new FlyNoWay()
  override var quackBehavior: QuackBehaviors = new Quack()

  override def display(): Unit = println("I’m a model duck")

}
