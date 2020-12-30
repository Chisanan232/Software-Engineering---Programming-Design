#! /etc/anaconda/python3

from AbstractDisplay import AbstractDisplay


class StringDisplay(AbstractDisplay):

    __string = None
    __width = None

    def __init__(self, string):
        self.__string = string
        # self.__width = len(bytes(string))
        self.__width = len(string)

    def start(self):
        self.print_line()

    def print(self):
        print("|" + self.__string + "|")

    def end(self):
        self.print_line()

    def print_line(self):
        s = ""
        for _ in range(0, self.__width):
            s += "-"
        print("+" + s + "+")
