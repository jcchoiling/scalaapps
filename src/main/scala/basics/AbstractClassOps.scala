package code

/**
  * Created by jcchoiling on 23/1/2017.
  */
class AbstractClassOps {
  var id: Int=_
}

abstract class SuperTeacher(val name: String){

  var id: Int

  var age: Int

  def teach()

}

class TeacherForMaths(name:String) extends SuperTeacher(name){

  override var id: Int = name.hashCode()

  override var age: Int = 29

  override def teach {println("Teaching")}

}

object AbstractClassOps{
  def main(args: Array[String]): Unit = {

    val teacher = new TeacherForMaths("Spark")

    println(teacher.id)
    println(teacher.name)
    println(teacher.age)
    teacher.teach

  }
}