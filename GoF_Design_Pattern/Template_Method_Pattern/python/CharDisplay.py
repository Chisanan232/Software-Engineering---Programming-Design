#! /etc/anaconda/python3

from AbstractDisplay import AbstractDisplay


class CharDisplay(AbstractDisplay):

    __ch = None

    def __init__(self, string):
        self.__ch = string

    def start(self):
        print("<<")

    def print(self):
        print(self.__ch)

    def end(self):
        print(">>")
