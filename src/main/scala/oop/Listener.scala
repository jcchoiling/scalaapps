package scala.oop

/**
  * Created by jcchoiling on 25/1/2017.
  *
  * 第一步，register函數接受一个 Listener 类型的对象，这里创建了一个匿名类 Listener
  * 第二步，因为 Listener 是抽象的，所以必需要具体定义它的trigger函數
  * 第三步，定义好之后再调用 sendNotification函數时，它具体是调用 listener 的 trigger函數
  * 第四步，因此、具体的trigger函數就执行！
  *
  * 运行结果：
  * Trigger at Wed Jan 25 00:50:06 HKT 2017
  */


abstract  class Listener {def trigger}

class Listening {

  var listener: Listener = null

  def register(l: Listener){listener = l}

  def sendNotification() {listener.trigger} // 当调用 register方法时，这里就不会时 NULL

}


object Notification extends App {

  val notification = new Listening()
//  notification.sendNotification() //不可以放在這里，會导致 java.lang.NullPointerException Error


  notification.register(new Listener {
    override def trigger = {println(s"Trigger at ${new java.util.Date}")}
  })

  notification.sendNotification()

}