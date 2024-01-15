#Class
class Printer:
    #Constructor
    def __init__(self, text):
        self.__text = text

    #Getter
    @property
    def text(self):
        return self.__text

    #Setter
    @text.setter
    def text(self, text):
        self.__text = text

    #Method
    def print_string(self):
        print(self.__text)

#Object
printer = Printer("Hello World!")
printer.print_string()