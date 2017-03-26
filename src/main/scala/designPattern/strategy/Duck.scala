package designPattern.strategy

/**
  * Created by jcchoiling on 24/3/2017.
  */
abstract class Duck {

  var quackBehavior: QuackBehaviors
  var flyBehavior: FlyingBehaviors

  def quack():Unit = {}
  def display():Unit = {}
  def swim():Unit = print("All ducks float, even decoys!")

  def performQuack(): Unit = quackBehavior.quack()
  def performFly(): Unit = flyBehavior.fly()

  def setFlyBehavior(fb: FlyingBehaviors) {
    this.flyBehavior = fb
  }

  def setQuackBehaviors(qb: QuackBehaviors) {
    this.quackBehavior = qb
  }



}
