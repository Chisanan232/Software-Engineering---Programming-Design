#! /etc/anaconda/python3

from Print import Print
from Banner import Banner


class PrintBanner(Banner, Print):

    def __init__(self, string):
        super(PrintBanner, self).__init__(string)

    def print_weak(self):
        self.show_with_paten()

    def print_strong(self):
        self.show_with_aster()
