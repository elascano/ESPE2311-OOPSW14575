import random

def getRandomOuterElement(rows, columns):
    randomRow = random.randint(0, rows)
    randomColumn: int
    if (randomRow == 0 or randomRow == rows):
        randomColumn = random.randint(0, columns)
    else:
        randomColumn = random.choice([0, columns])
    print(f"[{randomRow},{randomColumn}]")
    return

for i in range(10):
    getRandomOuterElement(5, 5)