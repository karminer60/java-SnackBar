package modules;

public class Snack
{
	private static int maxId = 0;

	private int id;
	private String name;

	public Snack(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}
      public int getVendingmachineId()
	{
		return VendingmachineId;
	}

	public int setgetVendingmachineId()
	{
		return VendingmachineId;
	}

	public String getName()
	{
		return name;
	}

    public String setName()
	{
		return name;
	}

    public int getCost()
	{
		return cost;
	}

	public int setCost()
	{
		return cost;
	}

    public int getQuantity()
	{
		return quantity;
	}
}



//add quantity when given how many to add
//buy snack when given how many to buy
//get total cost given a quantity