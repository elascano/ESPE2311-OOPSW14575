using System;

namespace CSInheritance.model
{
	public class LivingPlace
	{
		public string Adress{get;set;}
		public float RentCost{get;set;}
		public bool IsLeased{get;set;}

		public LivingPlace(string adress, float rentCost,bool isLeased)
		{
			Adress=adress;
			RentCost=rentCost;
			IsLeased=isLeased;
		}

		public void printPlace()
		{
			Console.Write(" Adress : " + Adress + ", Rent Cost: " + RentCost + ", Is leased? " + IsLeased);
		}
	}
}

