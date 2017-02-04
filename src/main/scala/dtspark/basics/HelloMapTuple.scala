package dtspark.basics

/**
  * Created by jcchoiling on 4/2/2017.
  */
object HelloMapTuple {
  def main(args: Array[String]): Unit = {

    val bigData = Map("Spark" -> 6, "Hadoop" -> 11)
    val person = Map(
      ("Janice",20),
      ("dtSpark",1)
    )

    val programmingLanguage = scala.collection.mutable.Map("Scala" -> 13, "Java" -> 23)


    for ((k,v) <- programmingLanguage){
      println(k + " : " +v)
    }

    println(programmingLanguage.getOrElse("Python",0))

    val personInformation = new scala.collection.mutable.HashMap[String, Int]
    personInformation += ("Kafka" -> 6, "Akka" -> 5, "Java" -> 10, "Spark" -> 7)
    personInformation -= ("Java")


    for ((name,age) <- personInformation) println(name + " : " + age)

    println(personInformation.keySet)
    println(personInformation.values)
    println(bigData.values)

    for (key <- personInformation.keySet) println(key)
    for (value <- personInformation.values) println(value)

    val result = for ((name,age) <- personInformation) yield (age, name)
    for ((k,v) <- result) println(k + " : " + v)

    val person_score1 = scala.collection.immutable.SortedMap(
      "Janice" -> 80,
      "Peter" -> 85,
      "Ben" -> 95
    )

    val person_score2 = scala.collection.immutable.SortedMap(
      85 -> "Janice",
      75 -> "Peter",
      95 -> "Ben",
      25 -> "Amy",
      100 -> "Ken",
      10 -> "Rain"
    )

    for ((name,score) <- person_score1) println(name + " : " + score)
    for ((name,score) <- person_score2) println(name + " : " + score)

    println("-" * 100)
    val fruits1 = scala.collection.immutable.SortedMap(
      "Orange" -> 2,
      "Pineapple" -> 33,
      "Apple" -> 4)

    val fruits2 = new scala.collection.mutable.LinkedHashMap[String, Int]
    fruits2 += ("Orange" -> 2, "Pineapple" -> 33, "Apple" -> 4)

    for ((fruit,price) <- fruits1) println(fruit + " : " + price)
    for ((fruit,price) <- fruits2) println(fruit + " : " + price)

    println("-" * 100)
    val info = ("Janice", "Femal", 28, "I love Scala")
    println(info)
    println(info._3)



  }
}
