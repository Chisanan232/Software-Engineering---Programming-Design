#! /etc/anaconda/python3

from abc import ABCMeta, abstractmethod


class Iterator(metaclass=ABCMeta):

    @abstractmethod
    def has_next(cls):
        pass

    @abstractmethod
    def next(cls):
        pass
