#! etc/anaconda/python3

from abc import ABCMeta, abstractmethod


class Aggregate(metaclass=ABCMeta):

    @abstractmethod
    def iterator(cls):
        pass
