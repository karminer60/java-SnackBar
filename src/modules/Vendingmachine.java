package modules;

public class Vendingmachine
{
	private static int maxId = 0;
	private int id;
	private String name;
	

	public Company(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
		
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

	
}

//Vending machine has fields (so knows)

//* maxId - keep track of last used vending machine id
//* id - automatically generated field
//* name


