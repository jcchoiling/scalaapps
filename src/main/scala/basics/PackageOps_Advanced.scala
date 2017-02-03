package code

/**
  * Created by janicecheng on 24/1/2017.
  *
  *
  *
  *
  *
  */


package spark {
  /*spark package 创建了一个 spark 的包，里面有 navigation 的包*/

  package navigation {

    /*start of navigation package*/
    private[spark] class Navigator { // 这个类只允许spark包以下的类或者是成员看见的

      protected[navigation] def useStartChart() {} // 这个类只允许 navigation 包以下的子类看见啦
        class LegOfJourney {
          private[Navigator] val distance = 100
        }
        private[this] var speed = 200 // 对象私有的，必需在 Navigator 内部并且是这个对象私有的

    }

    package lanuch{
      object Vehicale {
//        private[launch] val guide = new Navigator
      }
    }
  } /*navigation 包结尾*/
} /*spark 包结尾*/

/**
  * 这个是伴生类和伴生对象，伴生对象可随时地访问伴生类的方法 e.g.canMakeIt 是类中的方法
  *
  */
class PackageOps_Advanced {
  import PackageOps_Advanced.power

  private def canMakeIt = power > 1001


}
object PackageOps_Advanced {

  private def power = 1000

  def makeItTrue(p: PackageOps_Advanced): Boolean = {
    val results = p.canMakeIt
    results
  }
}
