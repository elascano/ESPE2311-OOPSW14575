class Device():
    def __init__ (self,storage,ram,cpu):
        self.storage = storage
        self.ram = ram
        self.cpu = cpu

    def show_config(self):
        print("Storage: ",self.storage)
        print("Ram: ",self.ram)
        print("Cpu: ",self.cpu)

class Phone(Device):
    def __init__ (self,storage,ram,cpu,screen):
        super().__init__(storage,ram,cpu)
        self.screen = screen

    def do_a_call(self):
        print("Calling...")



class Computer(Device):
    def __init__ (self,storage,ram,cpu,keyboard):
        super().__init__(storage,ram,cpu)
        self.keyboard = keyboard

    def type(self):
        print("Typing...")

