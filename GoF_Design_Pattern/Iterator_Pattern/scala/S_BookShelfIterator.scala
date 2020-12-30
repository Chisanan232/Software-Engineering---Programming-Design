package Software_Engineering.GoF_Design_Pattern.Iterator_Pattern.scala

class S_BookShelfIterator (private val bookShelf: S_BookShelf) extends S_Iterator {

  private var index: Int = 0

  override def hasNext: Boolean = {
    index < bookShelf.getLength
  }

  override def next(): AnyRef = {
    var book = bookShelf.getBookAt(index)
    index += 1
    book
  }

}
