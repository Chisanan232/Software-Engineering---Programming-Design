#! /etc/anaconda/python3


class Banner:

    __string = None

    def __init__(self, string):
        self.__string = string

    def show_with_paten(self):
        print("(" + self.__string + ")")

    def show_with_aster(self):
        print("*" + self.__string + "*")
