package modules;

public class Customer
{
	//fields - things that the class knows
	private static int maxId = 0;
	private int id;
	private String fname;
	private int amount;
	private double cashOnHand;

	public Customer(String fname, double cashOnHand)
	{
		maxId++;
		id =maxId;

		this.fname = fname;
		
		this.cashOnHand = cashOnHand;
	}

	public int getId( )
	{
		return id;
	}



 	public String getFname(String fname)
	{
		return fname;
	}  

	public void setFname(String fname)
	{
		this.fname = fname;
		//this-the fields that we are dealing with 
	} 

	public double getCashOnHand()
	{
		return cashOnHand;
	}


	public void addAmount( double cash)
	{
		this.cashOnHand += cash;
	}

	public void subAmount(double cash)
	{
		this.cashOnHand -= cash;
	}
}

//Customer has fields (so knows)

//* maxId - keep track of last used customer id
//* id - automatically generated field
//* name
//* cash on hand

//Customer has methods (so can)



//* add cash to cash on hand

//* buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount