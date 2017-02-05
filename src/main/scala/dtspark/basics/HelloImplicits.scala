package dtspark.basics

/**
  * Created by jcchoiling on 5/2/2017.
  */

class Man(val name: String)

//object Man {
//  implicit def man2SuperMan(man: Man) = new SuperMan(man.name)
//}

class SuperMan(val name: String){
  def makeMirarcle = println(this.name + " : " + "Wow, wow, wow....")
}

object Implicits {
  implicit def man2SuperMan(man: Man) = new SuperMan(man.name)
}

object HelloImplicits {
  def main(args: Array[String]): Unit = {

    import dtspark.basics.Implicits._

    val man = new Man("Alex")
    man.makeMirarcle

    implicit val content = "Dollar"
    talk("Scala")

  }

  def talk(name: String)(implicit content: String) = println(name + " : " + content)

}
