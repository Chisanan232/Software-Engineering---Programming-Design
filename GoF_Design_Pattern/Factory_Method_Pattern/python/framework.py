#! /etc/anaconda/python3

from abc import ABCMeta, abstractmethod


class PyCrawler(metaclass=ABCMeta):

    @abstractmethod
    def send_http(self) -> None:
        pass



class CrawlerFactory(metaclass=ABCMeta):

    def create(self, owner: str) -> PyCrawler:
        crawler: PyCrawler = self.build_crawler(owner)
        self.register_url(crawler)
        return crawler


    @abstractmethod
    def build_crawler(self, owner: str) -> PyCrawler:
        pass


    @abstractmethod
    def register_url(self, product: PyCrawler) -> None:
        pass


