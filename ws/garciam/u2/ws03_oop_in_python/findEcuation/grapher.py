import matplotlib.pyplot as plt

class Grapher:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def showGraph(self):
        plt.plot(self.x, self.y)

    def graph(self):
        plt.plot(self.x, self.y)
        plt.xlabel('x')
        plt.ylabel('y')
        plt.title('Graph')

        plt.legend()

        plt.grid(True)
        plt.show()