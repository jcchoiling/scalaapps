package scala.Advanced

/**
  * Created by jcchoiling on 29/1/2017.
  *
  * trait Function1[-S, +T] {
  *   def apply(x: S): T
  * }
  *
  * Publication => String is a subtype of Book => AnyRef
  *
  */


class Publication (val title: String)

class Book (title: String) extends Publication (title)

object Type_Library {

  val books: Set[Book] =
    Set(
      new Book("Programming in Scala"),
      new Book("Scala in Action")
    )

  def printBookList(info: Book => AnyRef): Unit ={
    for (book <- books) println(info(book))
  }

}

object Book_Customer extends App {

  def getTitle(p: Publication): String = p.title

  Type_Library.printBookList(getTitle)
}
