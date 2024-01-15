from model import EcuationFinder

class Menu:
    def __init__(self, path):
        self.__ecuation_finder = EcuationFinder.EcuationFinder(path)
        self.__opt = 0

    def print_menu(self):
        print('Chose an option:')
        while True:
            try:
                self.__opt = int(input("""1) View Graph of the points
2) Get adjusted function
3) Generate report
4) Exit
option: """))
            except ValueError:
                print("That's not an option")
                continue

            if self.__opt == 1:
                self.__ecuation_finder.show_points_graph()
            elif self.__opt == 2:
                self.__ecuation_finder.find_ecuation()
            elif self.__opt == 3:
                self.__ecuation_finder.generate_report()
            elif self.__opt == 4:
                break
            else:
                print('Invalid option')
                continue

    @property
    def opt(self):
        return self.__opt

    @opt.setter
    def opt(self, opt):
        self.__opt = opt