package designPattern.strategy

/**
  * Created by jcchoiling on 24/3/2017.
  */
class MallardDuck extends Duck{

  println("---MallardDuck---")

  override var quackBehavior: QuackBehaviors = new Quack()
  override var flyBehavior: FlyingBehaviors = new FlyWithWings()

  override def display(): Unit = print("I am a real Mallard duck!")

}
