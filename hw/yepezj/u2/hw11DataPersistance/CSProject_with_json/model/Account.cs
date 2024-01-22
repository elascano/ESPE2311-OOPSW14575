using System;

namespace CSProyect.model
{
    public class Account
    {
       private int accountNumber;
	   private float balance;

	   public static Account createForFistTime()
	   {
		Console.WriteLine("Enter the Account Number");
        int accountNumbermber=Convert.ToInt32(Console.ReadLine());

		return new Account(accountNumbermber,0);
	   }

	   public static Transaction deposit(Account currentAccount)
	   {

		int id=123;
		int idToSearch=0;


		Console.WriteLine(" Enter the account ID you want to deposit to: ");
		idToSearch=Convert.ToInt32(Console.ReadLine());

		Console.WriteLine(" Enter the ammount you want to deposit: ");
		float ammount=float.Parse(Console.ReadLine());

		if(idToSearch==currentAccount.AccountNumber)
		{
			currentAccount.Balance+=ammount;
		}else
		{
			currentAccount.Balance-=ammount;
		}

		int accountId = currentAccount.AccountNumber;

		

		return new Transaction(id,ammount,accountId);
	   }

	   public Account(int accountNumber, float balance)
	   {
		this.accountNumber=accountNumber;
		this.balance=balance;
	   }

	   public float Balance
	   {
		get{return balance;}
		set{balance=value;}
	   }

	   public int AccountNumber
	   {
		get{return accountNumber;}
		set{accountNumber=value;}
	   }
    }
}