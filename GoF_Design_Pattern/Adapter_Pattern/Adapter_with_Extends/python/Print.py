#! /etc/anaconda/python3

from abc import ABCMeta, abstractmethod


class Print(metaclass=ABCMeta):

    @abstractmethod
    def print_weak(self):
        pass

    @abstractmethod
    def print_strong(self):
        pass
