package Software_Engineering.GoF_Design_Pattern.Iterator_Pattern.scala

class S_BookShelf(private val maxSize: Int) extends S_Aggregate {

  private var books: Array[S_Book] = new Array[S_Book](maxSize)
  private var last: Int = 0

  def getBookAt(index: Int): S_Book = {
    this.books.apply(index)
  }


  def appendBook(book: S_Book): Unit = {
    this.books(this.last) = book
    last += 1
  }


  def getLength(): Int = {
    last
  }


  override def iterator(): S_Iterator = {
    new S_BookShelfIterator(this)
  }

}
