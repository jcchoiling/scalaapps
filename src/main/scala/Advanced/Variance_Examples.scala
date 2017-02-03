package scala.Advanced

/**
  * Created by jcchoiling on 27/1/2017.
  *
  * List[+T] - 定义 container 的关系是不是和DataType的继承关系 (父子关系)
  * 假设有三个 DataType: AnyRef、String、Nothing
  *
  * Subtype:
  * [+T] 定义 container类型 和 actual DataType 类型存在 subtype 关系 (子类)
  * String 是不是 AnyRef 的 subtype (如果类型参数是 AnyRef，那么目标类型参数 (String) 是不是 AnyRef 的子类)
  * e.g. val x: List[AnyRef] = new List[String] // 将 AnyRef 代入 T 类型
  *
  * [+T] 定义 container类型 和 actual DataType 类型存在 subtype 关系 (子类)
  * Nothing 是不是 String 的 subtype (如果类型参数是 String，那么目标类型参数 (Nothing) 是不是 String 的子类)
  * e.g. val x: List[String] = new List[Nothing] // 将 String 代入 T 类型
  *
  *
  * Supertype:
  * [-T] 定义 container类型 和 actual DataType 类型存在 supertype 关系 (父类)
  * AnyRef 是不是 String 的 supertype (如果类型参数是 String，那么目标类型参数 (AnyRef) 是不是 String 的父类)
  * e.g. val x: List[String] = new List[AnyRef] // 将 AnyRef 代入 T 类型
  *
  * [-T] 定义 container类型 和 actual DataType 类型存在 supertype 关系 (父类)
  * String 是不是 Nothing 的 subtype (如果类型参数是 Nothing，那么目标类型参数 (String) 是不是 Nothing 的父类)
  * e.g. val x: List[Nothing] = new List[String] // 将 Nothing 代入 T 类型
  *
  */


class Diamond
class Gold extends Diamond
class Silver extends Gold

class InvariantClass[A]
class CovariantClass[+A]
class ContravariantClass[-A]

class Variance_Examples {

  def invarMethod(x: InvariantClass[Gold]){} //当类型参数是Gold时，目标类型参数必需跟自己是同一类型
  def covarMethod(x: CovariantClass[Gold]){} //当类型参数是Gold时，目标类型参数必需是它的子类
  def contravarMethod(x: ContravariantClass[Gold]){} //当类型参数是Gold时，目标类型参数必需是它的父类

  /**
    * InvariantClass[A]
    */
  //  invarMethod(new InvariantClass[Silver])
  invarMethod(new InvariantClass[Gold])
//  invarMethod(new InvariantClass[Diamond])

  /**
    * CovariantClass[+A], allow only Gold or Silver customers to access
    */

  covarMethod(new CovariantClass[Silver])
  covarMethod(new CovariantClass[Gold])
//  covarMethod(new CovariantClass[Diamond])

  /**
    * ContravariantClass[-A], allow only Gold or Diamond customers to access
    */
//  contravarMethod(new ContravariantClass[Silver])
  contravarMethod(new ContravariantClass[Gold])
  contravarMethod(new ContravariantClass[Diamond])



}
