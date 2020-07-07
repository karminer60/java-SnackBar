package modules;

public class Vendingmachine
{
	private static int maxId = 0;
	public int id;
	public String name;
	public int debt;

	public Company(String name, int id)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.debt = debt;
	}

    public int getId(int id)
	{
		return id;
	}

    public String getName(String name)
	{
		return name;
	}

    public String setName(String name)
	{
		return name;
	}

	@Override
	public String toString()
	{
		return "Company: " + name + "debt" + 100;
	}
}

//Vending machine has fields (so knows)

//* maxId - keep track of last used vending machine id
//* id - automatically generated field
//* name


