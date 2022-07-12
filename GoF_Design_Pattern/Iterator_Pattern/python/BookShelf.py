#! /etc/anaconda/python3

from BookShelfIterator import BookShelfIterator
from aggrgate import Aggregate


class BookShelf(Aggregate):

    __books = []
    __last = 0

    def __init__(self, max_size):
        self.__books = [None] * max_size

    def get_book_at(self, index):
        return self.__books[index]

    def insert_book(self, book):
        self.__books[self.__last] = book
        self.__last += 1

    def get_length(self):
        return self.__last

    def iterator(cls):
        return BookShelfIterator(cls)
