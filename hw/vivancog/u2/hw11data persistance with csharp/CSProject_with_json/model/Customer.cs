using System;
using CSProyect.view;

namespace CSProyect.model
{
    public class Customer
    {
       private int id;
	   private string name;
	   private string adress;
	   private Account account;

	   public static Customer createForFirstTime()
	   {
		Console.WriteLine("Enter the Id");
        int id=Convert.ToInt32(Console.ReadLine());
		Console.WriteLine("Enter your name");
		string name=Console.ReadLine();
		Console.WriteLine("Enter your current adress");
		string adress=Console.ReadLine();

		Account account = Account.createForFistTime();


		return new Customer(id,name,adress,account);
	   }

	   public static void logIn(List<Customer> registeredCustomers){
		int inputId=0;
		bool idFound=false;

		
		do
		{
			Console.WriteLine("Enter an existing Customer ID");
			inputId=Convert.ToInt32(Console.ReadLine());
			foreach(Customer currentCustomer in registeredCustomers)
            {
                if(inputId==currentCustomer.Id)
			    {
				    idFound=true;
				    Menus.accountMenu(currentCustomer);
					break;
			    }else{
					Console.WriteLine("The ID wasn't found!");
				}
            }

		}while(idFound==false);

	   }

	   public string print()
	   {
		return " Id: " + Id + ", Name: " + Name + ", Adress: " + Adress;
	   }

	   public Customer(int id, string name, string adress, Account account)
	   {
		this.id=id;
		this.name=name;
		this.adress=adress;
		this.account=account;
	   }

	   public int Id
	   {
		get{return id;}
		set{id=value;}
	   }

	   public string Name
	   {
		get{return name;}
		set{name=value;}
	   }

	   public string Adress
	   {
		get{return adress;}
		set{adress=value;}
	   }

	   public Account Account
	   {
		get{return account;}
		set{account=value;}
	   }

        
    }
}