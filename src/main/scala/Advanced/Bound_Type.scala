package scala.Advanced

/**
  * Created by jcchoiling on 27/1/2017.
  */


class BaseUser(val name: String)
class Admin(name: String, val level: String) extends BaseUser(name)
class Customer(name: String) extends BaseUser(name)
class PreferredCustomer(name: String) extends Customer(name)

object Bound_Type extends App{

  /**
    * Bound Types System
    * <: upper bound
    * >: lower bound
    */
  def check[A <: BaseUser](u: A) = if (u.name.isEmpty) println("Fail")

  check(new Customer("Alex"))
  check(new Admin("", "CEO"))

}
