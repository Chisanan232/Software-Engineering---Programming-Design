#! /etc/anaconda/python3

from BookShelf import BookShelf
from Book import Book


def book_main():
    # Initial BookShelf Object
    book_store = BookShelf(10)
    # Insert Book object
    book_store.insert_book(Book("Around the world i 80 days"))
    book_store.insert_book(Book("Bible"))
    book_store.insert_book(Book("Cinderella"))
    book_store.insert_book(Book("Daddy long legs"))

    # Get the iterator
    book_store_iterator = book_store.iterator()
    while book_store_iterator.has_next():
        book = book_store_iterator.next()
        print("Book Name: " + book.get_name())


if __name__ == '__main__':

    book_main()
