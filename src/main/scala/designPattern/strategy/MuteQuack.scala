package designPattern.strategy

/**
  * Created by jcchoiling on 24/3/2017.
  */
class MuteQuack extends QuackBehaviors{

  override def quack():Unit = println("<< Silence >>")

}
