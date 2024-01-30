using System;
using Newtonsoft;
using CSProyect.model;
using CSProyect.utils;

namespace CSProyect.view
{
	public class Menus
	{
		public static void bankMenu()
	    {

			List<Customer> customers = new List<Customer>();
			customers=ManageJson<Customer>.read("data/customers.json");


			Console.WriteLine(String.Join(", ", customers));
		    int option=0;
			do{
				Console.WriteLine(" ------ Main Bank Menu ------");
		        Console.WriteLine(" 1. Create a new Customer    ");
		        Console.WriteLine(" 2. Login as a Customer      ");
			    Console.WriteLine(" 3. Exit                     ");
			    Console.WriteLine(" ----------------------------");
			    option=Convert.ToInt32(Console.ReadLine());
			    switch(option)
			    {
				    case 1:
						customers.Add(Customer.createForFirstTime());
						ManageJson<Customer>.save(customers,"data/customers.json");
						Console.WriteLine("New customer Added!");
				        break;
				    case 2:
					    Customer.logIn(customers);
				        break;
				    case 3:
				        break;
				    default:
					    Console.WriteLine(" Invalid Option try again!");
						break;
			    }
			}
			while(option!=3);
	    }

		public static void accountMenu(Customer customerAccount)
	    {
			List<Customer> customers = new List<Customer>();
			customers=ManageJson<Customer>.read("data/customers.json");
		    int option=0;
			do{
				Console.WriteLine(" ------ Account Menu ------");
		        Console.WriteLine(" 1. Deposit Money          ");
		        Console.WriteLine(" 2. Withdraw Money         ");
				Console.WriteLine(" 3. Consult balance        ");
			    Console.WriteLine(" 4. Exit                   ");
			    Console.WriteLine(" --------------------------");
			    option=Convert.ToInt32(Console.ReadLine());
			    switch(option)
			    {
				    case 1:
					    Transaction transaction = Account.deposit(customerAccount.Account);
						foreach(Customer currentCustomer in customers)
                        {
                            if(customerAccount.Id==currentCustomer.Id)
			                {
				                currentCustomer.Account.Balance=customerAccount.Account.Balance;
								break;
			                }
                        }
						ManageJson<Customer>.save(customers,"data/customers.json");
				        break;
				    case 2:
				        break;
					case 3:
					    Console.WriteLine("The account: " + customerAccount.Account.AccountNumber + " balance is: $" + customerAccount.Account.Balance);
				        break;
				    case 4:
				        break;
				    default:
					    Console.WriteLine(" Invalid Option try again!");
						break;
			    }
			}
			while(option!=4);
	    }
	}
	
}