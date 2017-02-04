package com.dtspark.scala.basics
/**
  * 1,在Scala的集合体系中Iterable是共同的Trait，Iterable要求继承者实现一些共同的方法，例如对元素的遍历等；
  * 2，Array是一个非常基础的数据结构，不从属于Scala集合的体系；
  * 3，Scala的集合体系中集合分为可变集合与不可变集合之分；不可变的集合在scala.collection.immutable包中，可变
  * 		的集合在scala.collection.mutable；
  * 4, List是元素的列表集合，是不可变的：
  * 		第一点：List中head是指第一个元素，tail是指剩下的元素构成的List集合；
  * 		第二点：使用::这个操作符来把List和其它的元素进行组拼来构建新的List
  * 		第三点：如果集合中没有元素的话，此时为Nil，例如说List中只有一个元素，那么head就是这个元素本身，tail操作就会返回Nil
  * 5，LinkedList是元素可变的列表
  * 6, Set是元素不可重复的集合,且元素是无序的；HashSet中的元素不可变且不可重复且不能够保证顺序；
  * 7，LinkedHashSet会维护元素的插入顺序；
  * 8, SortedSet会自动的把插入的元素进行排序；
  */
object Functional_Iterable {
  def main(args: Array[String]): Unit = {
        val range = 1 to 10

        val list = List(1,2,3,4,5)
        println(list.head)
        println(list.tail)

        println(0::list)


        var linkedList = scala.collection.mutable.LinkedList(1,2,3,4,5)
        println(linkedList.elem)
        println(linkedList.tail)

        while(linkedList != Nil){
          println(linkedList.elem)
          linkedList = linkedList.tail
        }

        println(linkedList)

        val copied = linkedList.+:(9)
        println(copied)

        val set = Set(1,2,3,4,5)
        println(set)

        val setMore = set + 1
        println(setMore)

        val hashSet = scala.collection.mutable.HashSet(1,2,3)
        hashSet += 5
        hashSet += 50
        println(hashSet)

        val linkedHashSet = scala.collection.mutable.LinkedHashSet(1,2,3)
        linkedHashSet += 5
        linkedHashSet += 50
        linkedHashSet += 4
        println(linkedHashSet)

        val sortedSet = scala.collection.mutable.SortedSet(1, 2, 3, 5, 50, 4)
        println(sortedSet)

    println(List[String]("I am into Spark so much","Scala is powerful").flatMap { x => x.split(" ") }.map { x => (x, 1) }.map(x => x._2).reduce(_+_))
    println(List[String]("I am into Spark so much","Scala is powerful").flatMap { x => x.split(" ") }.map {(_, 1) }.map(_._2).reduce(_+_))
    println(List[String]("I am into Spark so much","Scala is powerful").flatMap { x => x.split(" ") }.map {(_, 1) }.map(_._2).reduce((x,y) =>x + y))

    List(0,1,2,3,4,5).foreach { x => println(x) }
    List(0,1,2,3,4,5).foreach {println(_) }
    List(0,1,2,3,4,5).foreach {println _ }
    List(0,1,2,3,4,5).foreach {println }
    List(0,1,2,3,4,5).foreach (println)
  }
}