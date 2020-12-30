#! /etc/anaconda/python3

from CharDisplay import CharDisplay
from StringDisplay import StringDisplay


def template_main():
    cd1 = CharDisplay("H")
    sd1 = StringDisplay("Hello, World")

    cd1.display()
    sd1.display()


if __name__ == '__main__':

    template_main()
