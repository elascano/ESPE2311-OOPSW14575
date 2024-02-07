using System;
using CSInheritance.model;

namespace CSInheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
			Console.WriteLine("Inheritance Classes");
			House house1 = new House("av Inca", 160,true,3,false);
			Console.WriteLine("House: ");
            house1.printHouse();

            Apartment apartemnt1 = new Apartment("av Shyris", 350,true,"Sol del Este",27);
			Console.WriteLine("\n\nApartment: ");
            apartemnt1.printApartment();
            
        }
    }
}
