#! /etc/anaconda/python3

from Iterator import Iterator


class BookShelfIterator(Iterator):

    __book_shelf = None
    __index = None

    def __init__(self, book_shelf):
        self.__book_shelf = book_shelf
        self.__index = 0

    def has_next(cls):
        if cls.__index < cls.__book_shelf.get_length():
            return True
        else:
            return False

    def next(cls):
        book = cls.__book_shelf.get_book_at(cls.__index)
        cls.__index += 1
        return book
