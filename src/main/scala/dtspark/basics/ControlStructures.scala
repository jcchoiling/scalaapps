package com.dtspark.scala.basics

/**
  * Scala中的基本控制结构有顺序、条件和循环三种方式，这个其它的JVM语言是一致的，但是Scala也有一些高级的流程控制结构类模式匹配；
  * 在这里我们主要if、for、while等三种控制结构及其企业级最佳实践，并且在最后用Spark源码说明
  *
  */
object ControlStructures {
  def main(args: Array[String]): Unit = {
    println("Scala")

    /**
      * if条件表达式会更会if会面括号里面的boolean值来决定整个if表达式的值
      *
      * 1，Scala中的if条件表达式是有值的！！！ 这个Java是不一样的！
      * 2，  if条件表达式中可以进行类型推倒，类型推到的一般过程就是更具变量的值的类型来推倒确定变量的类型，这在很多复杂算法的实现的时候可以让我们
      * 		省略掉变量的类型的书写，为复杂算法的实现提供了非常大的便利；
      * 3,如果if后面没有else部分，默认的实现是if(....) ... else ()
      * 	下面的 例子节选自Spark的核心类SparkContext，在else部分虽然不返回有意义的结果，但是依旧没有省略else，而是使用了else { None}这种方式
      * 	其目的是为了确保if条件表达式的类型为处理逻辑需要的类型Option，而不是Any类型，为下一步的处理大家基础
      * 	if (isEventLogEnabled) {Some(logger) } else { None}
      * 4，if表达式中如果有多条语句可以使用{}包裹起来，但是这里就有一个问题了，{}中的多条语句，哪一条是计算结果呢，前面已经说明，是{}中的最后一条语句
      * 5，补充说明，{...} 代表了一个语句块，语句块是有值的，值就是最后一条语句，请类型是最后一条语句值的类型
      * 6, if表达式可以用在for循环等其它控制结构中用于限制结果
      */
    var age = 10
    val result = if (age > 25) "Worker" else "Student"  //此时因为"Worker" 和 "Student"都是字符串，所以result也是字符串类型
    println(result)

    val result2 = if (age > 18) "Adult" else 1 //此时因为if表达式中的else两侧的内容一个是字符串类型、另外一个是整数类型，所以result2的类型是两种的公共父类Any

    val result3 = if (age > 18) "Adult" else ()

    println(result3)

    var x,y =0

    val result4  = if(age < 18) {
      x = x + 1;
      y = y + 1;
      x + y
    } else 0

    println(result4)

    for(i <- 0 to 5 if i%2 ==0 ) {
      println(i)
    }

    /**
      * for循环是不断的循环一个集合，然后for循环后面的{...}代码块部分会根据for循环(...)里面提取的集合的item来作为{...}的输入进程流程控制
      * 1,for循环中加入的if叫做条件守卫，用于限制for循环（优化for循环，去掉不必要的执行步骤，或者说用于跳出for循环）
      * 2,最后再次强调一下,在for循环中能够提取出什么内容取决于后面的集合的类型！
      * 3,想跳出for循环的话，除了加入if守卫以外，还可以使用return关键字
      */

    var flag = true
    var sum = 0
    for(i <- 0 to 6 if flag){
      sum = sum + i
      if(5 == i) flag = false
    }
    println("sum = " + sum)
    /* sum = 0

     for(i <- 0 to 6){
       sum = sum + i
       if(5 == i) return //return 返回的是方法级别的，这在实际开发中也非常常用
     }*/

    println("sum with return = " + sum)


    for(item <- "Hello Spark".split(" ")) println(item)




    /**
      * while循环，也是循环集合来作为{...}的输入，进而完成流程的控制的，while循环在实际Server和Framework开发中至关重要，例如让一个
      * 线程一直循环下去，一般都会使用while;
      *
      */


    import scala.util.control.Breaks._
    flag =true
    breakable{
      while(flag){

        for(item <- "Spark"){
          println(item)
          if(item == 'r') {
            flag = false
            break
          }
        }

      }
    }


    println("while finished!!!")


  }
}