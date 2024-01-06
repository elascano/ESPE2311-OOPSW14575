using System;

namespace CSProyect.model
{
    public class Transaction
    {
       private int id;
	   private float ammount;
	   private int accountId;

	   public Transaction(int id, float ammount,int accountId)
	   {
		this.id=id;
		this.ammount=ammount;
		this.accountId=accountId;
	   }

	   public int Id
	   {
		get{return id;}
		set{id=value;}
	   }

	   public int AccountId
	   {
		get{return accountId;}
		set{accountId=value;}
	   }

	   public float Ammount
	   {
		get{return ammount;}
		set{ammount=value;}
	   }
    }
}