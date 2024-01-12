using System;

namespace CSInheritance.model
{
	public class Apartment:LivingPlace
	{
		public string BuildingBelonging{get;set;}
		public int DoorNumber{get;set;}

		public Apartment(string adress, float rentCost,bool isLeased, string buildingBelonging, int doorNumber):base(adress, rentCost, isLeased)
		{
			BuildingBelonging=buildingBelonging;
			DoorNumber=doorNumber;
		}

		public void printApartment()
		{
			printPlace();
			Console.Write(", At building: " + BuildingBelonging + ", Door number : "+ DoorNumber);
		}
	}
}

