#! /etc/anaconda/python3

from abc import ABCMeta, abstractmethod


class AbstractDisplay(metaclass=ABCMeta):

    @abstractmethod
    def start(self):
        pass

    @abstractmethod
    def print(self):
        pass

    @abstractmethod
    def end(self):
        pass

    def display(self):
        self.start()
        for _ in range(0, 5):
            self.print()
        self.end()
