#! /etc/anaconda/python3

from framework import CrawlerFactory, PyCrawler
from test_crawler import TestCrawlerFactory, TestCrawler


def client_main():
    factory: CrawlerFactory = TestCrawlerFactory()
    product1: PyCrawler = factory.create(get_url("Michael_Jordan"))
    product2: PyCrawler = factory.create(get_url("Kobe_Bryant"))
    product3: PyCrawler = factory.create(get_url("Lebron_James"))
    product4: PyCrawler = factory.create(get_url("Penny_Hardaway"))

    product1.send_http()
    product2.send_http()
    product3.send_http()
    product4.send_http()


def get_url(name: str):
    return f"https://en.wikipedia.org/wiki/{name}"


if __name__ == '__main__':

    client_main()
