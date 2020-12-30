#! /etc/anaconda/python3

from framework import CrawlerFactory, PyCrawler
import requests


class TestCrawler(PyCrawler):

    __url: str = None

    def __init__(self, url: str):
        print(f"Manufacture URL {url}.")
        self.__url = url


    def send_http(self) -> None:
        print(f"Send HTTP Request to URL {self.__url}")
        response = requests.get(url=self.__url)
        print(f"Get HTTP response and HTTP status code is {response.status_code}.")


    def get_url(self) -> str:
        return self.__url



class TestCrawlerFactory(CrawlerFactory):

    __urls: list = []

    def get_urls(self) -> list:
        return self.__urls


    def build_crawler(self, url: str) -> PyCrawler:
        return TestCrawler(url=url)


    def register_url(self, crawler: PyCrawler) -> None:
        subclass_crawler: TestCrawler = crawler
        self.__urls.append(subclass_crawler.get_url())

