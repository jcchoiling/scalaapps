package LoggingBasic

/**
  * Created by jcchoiling on 19/3/2017.
  */
trait StdoutLogging extends LoggingTest {
  override def info(message: String) = println(s"[INFO] $message")
  override def warn(message: String) = println(s"[WARN] $message")
  override def deubg(message: String) = println(s"[DEBUG] $message")
}
