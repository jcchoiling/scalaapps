val statusHandler: Int => String = {
  case 200 => "okay"
  case 400 => "Your error"
  case 500 => "Our error"
  case _ => "nothing"
}

statusHandler(200)

import collection.mutable._
val b = new ArrayBuffer[String]

b += "Hello"

val q = new Queue[Int]
q.enqueue(3, 4, 5)
q
val pop = q.dequeue
q
