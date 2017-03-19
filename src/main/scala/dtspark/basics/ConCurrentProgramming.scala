//package dtspark.basics
//
//import scala.actors.Actor
//
//class HelloScalaActor extends Actor{
//  def act(){
//    while(true){
//      receive {
//        case "iScala" => println(thread.currentThread().getName)
//      }
//    }
//  }
//}
//
//class HiScalaActor extends Actor{
//  def act(){
//    loop{
//      react {
//        case "iScala" => {println(thread.currentThread().getName); }
//      }
//    }
//
//  }
//
//}
//
//object ConcurrentProgramming {
//  def main(args: Array[String]): Unit = {
//    //    val actor = new HelloScalaActor
//    //    val actor = new HiScalaActor
//    //    actor.start()
//    var counter = 0
//    while(counter < 1000000){
//      ((new HelloScalaActor).start()) ! "iScala"
//      counter += 1
//    }
//
//  }
//}