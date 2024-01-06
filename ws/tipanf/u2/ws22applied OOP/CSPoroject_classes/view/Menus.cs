using System;
using CSProyect.model;

namespace CSProyect.view
{
	public class Menus
	{
		public static void bankMenu()
	    {
			Customer customer=null;
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
					    customer = Customer.createForFirstTime();
						Console.WriteLine("New customer Added!");
				        break;
				    case 2:
					    Customer.logIn(customer);
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

		public static void accountMenu(Account account)
	    {
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
					    Transaction transaction = Account.deposit(account);
				        break;
				    case 2:
				        break;
					case 3:
					    Console.WriteLine("The account: " + account.AccountNumber + " balance is: $" + account.Balance);
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