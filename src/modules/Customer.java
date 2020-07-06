package modules;

public class Customer
{
	//fields - things that the class knows
	
	private String fname;
	private int amount;

	public Employee(String fname, int amount)
	{
		maxId++;
		id =maxId;

		this.fname = fname;
		
		this.amount = amount;
	}

 	public String getFname()
	{
		return fname;
	}  

	public void setFname(String fname)
	{
		this.fname = fname;
		//this-the fields that we are dealing with 
	} 

	public int getAmount()
	{
		return companyId;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}
}
