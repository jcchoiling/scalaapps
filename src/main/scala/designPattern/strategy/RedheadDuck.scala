package designPattern.strategy

/**
  * Created by jcchoiling on 24/3/2017.
  */
class RedheadDuck extends Duck{

  override var quackBehavior: QuackBehaviors = new Squeak()
  override var flyBehavior: FlyingBehaviors = new FlyNoWay()

  override def display(): Unit = print("Looks like a redhead")

}
