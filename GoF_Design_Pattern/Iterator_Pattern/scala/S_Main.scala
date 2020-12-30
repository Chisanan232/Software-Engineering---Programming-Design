package Software_Engineering.GoF_Design_Pattern.Iterator_Pattern.scala

object S_Main extends App {

  val bookShelf = new S_BookShelf(10)
  bookShelf.appendBook(new S_Book("Around the world in 80 days"))
  bookShelf.appendBook(new S_Book("Bible"))
  bookShelf.appendBook(new S_Book("Cinderella"))
  bookShelf.appendBook(new S_Book("Daddy Log Legs"))

  val bit = bookShelf.iterator()
  while (bit.hasNext()) {
    val book: S_Book = bit.next().asInstanceOf[S_Book]
    println("Book name: " + book.getName)
  }

}
