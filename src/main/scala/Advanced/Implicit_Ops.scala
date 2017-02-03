package scala.Advanced

/**
  * Created by jcchoiling on 29/1/2017.
  *
  *
  */


class PreferredPrompt(val preference: String)

class PreferredDrink(val preference: String)


object Greeter {
  def greet(name: String)(implicit prompt: PreferredPrompt,drink: PreferredDrink) = {
    println("Welcome, " + name + ". The system is ready.")
    print("But while you work, ")
    println("why not enjoy a cup of " + drink.preference + "?")
    println(prompt.preference)
  }
}

object JoesPrefs {
  implicit val prompt = new PreferredPrompt("Yes, master> ")
  implicit val drink = new PreferredDrink("tea")
}

object Implicit_Ops extends App {

  import Greeter._
  import JoesPrefs._

  /**
    * 第一、因为 greet()方法接受三个参数，一个是 name: String，一个是 prompt: PreferredPrompt 和 drink: PreferredDrink
    * 第二、当下面调用 greet("Joe") 时，只有一个参数肯定会报错
    * 第三、程式此时会查找有没有 implicit 方法，然后方法是 有 PreferredPrompt 和 PreferredDrink 类型的
    * 第四、找到符合的变量，SCALA 就会调用 implicit 方法来运行这个程序
    */

  greet("Joe")

}
