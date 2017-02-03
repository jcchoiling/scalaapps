package scala.type_parameterization

/**
  * Created by jcchoiling on 31/1/2017.
  */


trait Logger {
  def log (msg: String)
}


// 自身类型
trait Auth {
  auth: Logger =>
  def act(msg: String) {
    log(msg) // 首先调用 trait 本身的 log()
  }
}

// DI 必需是 Auth 和 Logger 类型
object DI extends Auth with Logger {
  override def log(msg: String) = println(msg)
}


object Dependency_Injection {

  def main(args: Array[String]): Unit = {
    DI.act("This is Dependency Injection Example")
  }

}
