import matplotlib.pyplot as plt

class Grapher:

    def __init__(self, x, y):
        self.__x = x
        self.__y = y

    def showGraph(self):
        plt.plot(self.__x, self.__y)
        plt.xlabel('x')
        plt.ylabel('y')
        plt.title('Graph')
        plt.legend([])

        plt.grid(True)
        plt.show()