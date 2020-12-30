#! /etc/anaconda/python3

from PrintBanner import PrintBanner


def adapter_extend():
    p = PrintBanner("Hello")
    p.print_weak()
    p.print_strong()


if __name__ == '__main__':

    adapter_extend()
