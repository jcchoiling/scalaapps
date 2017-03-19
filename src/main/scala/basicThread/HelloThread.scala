package basicThread

/**
  * Created by jcchoiling on 9/3/2017.
  */
object HelloThread extends App{

  val thread1 = new Thread(new Runnable{
    def run(): Unit ={
      println("Hello Runnable Thread"); Thread.sleep(1000)
      print("."); Thread.sleep(1000)
      print("."); Thread.sleep(1000)
      print("."); Thread.sleep(1000)
      print("."); Thread.sleep(1000)
      print("."); Thread.sleep(1000)
    }
  })
  thread1.start()

  val thread2 = new MyThread()
  thread2.start()

}


class MyThread extends Thread{
  override  def run(): Unit ={
    print("Hello MyThread"); Thread.sleep(1000)
    print("."); Thread.sleep(1000)
    print("."); Thread.sleep(1000)
    print("."); Thread.sleep(1000)
    print("."); Thread.sleep(1000)
    print("."); Thread.sleep(1000)
  }
}