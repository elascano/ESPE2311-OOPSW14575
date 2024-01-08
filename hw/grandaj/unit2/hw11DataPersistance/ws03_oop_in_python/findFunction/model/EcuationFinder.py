import csv
import sympy as sp
import numpy as np

from utils import grapher

class EcuationFinder:
    def __init__(self,__file_path):
        print("Were gona find the ecuation of a cuadratic ecuation")
        with open(__file_path, newline='', encoding='latin-1') as csvfile:
            reader = csv.reader(csvfile, delimiter=',')
            self.f1 = []
            self.f2 = []
            self.__data = []
            for row in reader:
                self.f1.append(row[0])
                self.f2.append(row[1])

    def showPointsGraph(self):
        x = self.depureColumn(self.f1)
        y = self.depureColumn(self.f2)
        grapher.Grapher(x, y).showGraph()


    def depureColumn(self,columnData):
        columnData = [float(x.replace(',','.')) for x in columnData]
        return columnData


    def createFun(self,x,solvedSystem):
        return round(solvedSystem[0,3],3) * x**2 + round(solvedSystem[1,3],3) * x +round (solvedSystem[2,3],3)


    def ln(self, x):
        return np.log(x)

    def sumation(self,setX):
        return sum(setX)

    def slope(self,y2,x2,y1,x1):
        print(f"({y2}-{y1})/({x2}-{x1})")
        return (y2-y1)/(x2-x1)

    def findEcuation(self):
        x = self.depureColumn(self.f1)
        y = self.depureColumn(self.f2)

        print("time: (s)" , x)
        print("position (m)", y)

        print("Σ x = ", self.sumation(x))
        print("Σ y = ", self.sumation(y))


        lnX = [self.ln(i) for i in x]

        lnY = [self.ln(i) for i in y]

        x2 = np.linspace(0, 10, 100)

        y2 = 0.41 + 0*x2

        sumX = sum(x)
        sumY = sum(y)

        sumLnX = sum(lnX)

        sumLnY = sum(lnY)

        print("Σ ln(x) = ", sumLnX)
        print("Σ ln(y) = ", sumLnY)

        setSize = x.__len__()
        m = self.slope(lnY[setSize- 1],lnX[setSize-1],lnY[6],lnX[6])

        print(f"Pendiente m = {m}")
        print(f"grado del polinomio {round(m)}")


        x_pow4 = [i**4 for i in x]
        x_pow3 = [i**3 for i in x]
        x_pow2 = [i**2 for i in x]
        yx = [x[i]*y[i] for i in range(0, setSize)]
        yx_pow2 = [(x[i]**2)*(y[i]) for i in range(0, setSize)]

        sumX_pow4 = sum(x_pow4)
        sumX_pow3 = sum(x_pow3)
        sumX_pow2 = sum(x_pow2)
        sumYX = sum(yx)
        sumYX_pow2 = sum(yx_pow2)

        print("Σ x^4 = ", sumX_pow4)
        print("Σ x^3 = ", sumX_pow3)
        print("Σ x^2 = ", sumX_pow2)
        print("Σ yx = ", sumYX)
        print("Σ yx^2 = ", sumYX_pow2)

        ecuationMatrix = sp.Matrix([
            [sumX_pow4,sumX_pow3,sumX_pow2,sumYX_pow2],
            [sumX_pow3,sumX_pow2,sumX,sumYX],
            [sumX_pow2,sumX,setSize,sumY]
        ])

        solvedSystem,lp = ecuationMatrix.rref()

        print(solvedSystem)

        print(f"y = {round(solvedSystem[0,3],3)}x^2 + {round(solvedSystem[1,3],3)}x + {round (solvedSystem[2,3],3)}")

        x = np.linspace(min(x), max(x), 100)
        y = self.createFun(x, solvedSystem)

        grapher.Grapher(x, y).showGraph()

        self.data = []
        self.data.append(['N','x','y','ln(x)','ln(y)','x^2','x^3','x^4','yx','yx^2'])
        for i in range(0, setSize):
            self.data.append([i,x[i],y[i],lnX[i],lnY[i],x_pow2[i],x_pow3[i],x_pow4[i],yx[i],yx_pow2[i]])
        self.data.append(['Σ',sumX,sumY,sumLnX,sumLnY,sumX_pow2,sumX_pow3,sumX_pow4,sumYX,sumYX_pow2])
        self.data.append([f"y = {round(solvedSystem[0,3],3)}x^2 + {round(solvedSystem[1,3],3)}x + {round (solvedSystem[2,3],3)}"])

    def generateReport(self):
        FILE_NAME = 'report.csv'
        self.findEcuation()
        with open(FILE_NAME, 'w', newline='') as FILE_NAME:
            escritor_csv = csv.writer(FILE_NAME)
            escritor_csv.writerows(self.data)


        @property
        def file_path(self):
            return self.__file_path

        @file_path.setter
        def file_path(self, file_path):
            self.__file_path = file_path