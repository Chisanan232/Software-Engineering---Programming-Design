#! /etc/anaconda/python3

from Print import Print
from Banner import Banner


class PrintBanner(Print):

    __banner = None

    # def __new__(cls, *args, **kwargs):
    #     return Print()

    def __init__(self, string):
        self.__banner = Banner(string)

    def print_weak(self):
        self.__banner.show_with_paten()

    def print_strong(self):
        self.__banner.show_with_aster()
