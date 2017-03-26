package designPattern.strategy

/**
  * Created by jcchoiling on 24/3/2017.
  */
class FlyNoWay extends FlyingBehaviors{

  override def fly():Unit = println("I cant fly")

}
