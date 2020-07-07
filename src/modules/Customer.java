package modules;

public class Customer
{
	//fields - things that the class knows
	
	private String fname;
	private int amount;

	public Employee(String fname, int cashOnHnad, int customerId)
	{
		maxId++;
		id =maxId;

		this.fname = fname;
		
		this.cashOnHand = cashOnHand;
	}

	public int getCostumerId( int customerId)
	{
		return costumerId;
	}

	public void setCostumerId(int companyId)
	{
		this.companyId = costumerId;
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

	public int getCashOnHand(int cashOnHand)
	{
		return cashOnHand;
	}

	public void setAmount(int amount)
	{
		this.cashOnHand = cashOnHand;
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