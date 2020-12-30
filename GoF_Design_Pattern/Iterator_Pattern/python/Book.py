#! /etc/anaconda/python3


class Book:

    __name = ""

    def __init__(self, name):
        self.__name = name

    def get_name(self):
        return self.__name
