using System;

namespace CSInheritance.model
{
	public class House:LivingPlace
	{
		public int Floor{get;set;}
		public bool HasGarage{get;set;}

		public House(string adress, float rentCost,bool isLeased,int floor, bool hasGarage):base(adress, rentCost, isLeased)
		{
			Floor=floor;
			HasGarage=hasGarage;
		}

		public void printHouse()
		{
			printPlace();
			Console.Write(", Floors : " + Floor + ", Has garage? " + HasGarage);
		}
	}
}

