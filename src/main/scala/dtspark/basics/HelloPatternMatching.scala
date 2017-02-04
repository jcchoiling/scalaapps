package dtspark.basics

import scala.collection.immutable.HashMap

/**
  * Created by jcchoiling on 4/2/2017.
  */

class DataFrameWork
case class ComputationFrameWork(name: String, popular: Boolean) extends DataFrameWork
case class StorageFrameWork(name: String, popular: Boolean) extends DataFrameWork

object HelloPatternMatching {
  def main(args: Array[String]): Unit = {

    getSalary("Hadoop", 12)
    getSalary("Python", 10)
    getSalary("Alluxio", 10)

    getMatchType(100)

    getMatchCollection(Array("Scala"))
    getMatchCollection(Array("Python"))
    getMatchCollection(Array("Scala", "Java"))
    getMatchCollection(Array("Spark", "Hadoop", "Kafka", "Hive"))

    getBigDataType(ComputationFrameWork("Spark",true))
    getBigDataType(ComputationFrameWork("Spark",false))

    getBigDataType(StorageFrameWork("HDFS",true))
    getBigDataType(StorageFrameWork("HDFS",false))

    getValue("Spark", Map("Spark" -> "The hottest","Hadoop" -> "The oldest"))

  }

  def getSalary(name: String, age: Int) {
    name match {
      case "Spark" => println("USD 150000/year")
      case "Hadoop" => println("USD 100000/year")
      case _  if name == "Scala" => println("USD 140000/year")
      case _  if name == "Python" => println("USD 90000/year")
      case _name  if age >= 5 => println(s"name: ${_name} age: ${age} USD 120000/year")
      case _ => println("USD 80000/year")
    }
  }

  def getMatchType(msg: Any) {
    msg match {
      case i: Int => println("Integer")
      case s: String => println("String")
      case d: Double => println("Double")
      case array: Array[String] => println("Array String")
      case _ => println("Unknown Type")
    }
  }

  def getMatchCollection(msg: Array[String]) {
    msg match {
      case Array("Scala") => println("One element")
      case Array("Scala", "Java") => println("Two elements")
      case Array("Spark", _*) => println("Many elements begins with Spark")
      case _ => println("Unknown Type")
    }
  }

  def getBigDataType(data: DataFrameWork){

    data match {
      case ComputationFrameWork(name, popular) =>
        println("ComputationFrameWork : name: " + name + " popular: " + popular)
      case StorageFrameWork(name, popular) =>
        println("StorageFrameWork : name: " + name + " popular: " + popular)
      case _ => println("Other Type")
    }
  }

  def getValue(key: String, content: Map[String, String]){

    content.get(key) match {
      case Some(value) => println(value)
      case None => println("Not found")
    }

  }

}
