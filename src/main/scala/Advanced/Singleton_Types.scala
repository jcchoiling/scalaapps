package scala.Advanced

/**
  * Created by jcchoiling on 25/1/2017.
  */

/**
  * 返回 Animals 的 this，因為 Animals 沒有 eat，所以會報錯
  */
class Animals1 {def breathe = this} // 返回 Animals 的 this，
class Cat1 extends Animals1 {def eat = this}

/**
  * 在 scala 中任何类、对象都有 type 属性，在下面这个例子中，我们看到它返回的是一个 this.type
  * 在调用 cat1.breathe 的时候，在 Animals2 中的this.type其实是指明 Cat2 的 type
  * 因为 Cat2 在 eat 方法，所以它不会报错
  *
  * this.type 意思是返回当前对象的类型
  */
class Animals2 {def breathe: this.type = this}
class Cat2 extends Animals2 {def eat: this.type = this}


object Singleton_Types {

  def main(args: Array[String]): Unit = {

    val cat1 = new Cat1
    val cat2 = new Cat2

    cat1.breathe
//    cat1.breathe.eat //因為 Animals 沒有 eat，所以會報錯

    cat2.breathe
    cat2.breathe.eat // 当 cat2 调用了 breathe 时，它的类型因为 this.type 而变成了 cat2类型


  }

}
