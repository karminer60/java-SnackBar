package modules;

public class Vendingmachine
{
	private static int maxId = 0;
	private int id;
	private String name;
	

	public Vendingmachine(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
		
	}

    public int getId()
	{
		return id;
	}

    public String getName()
	{
		return name;
	}

    public void setName(String name)
	{
		this.name = name;
	}

	
}

//Vending machine has fields (so knows)

//* maxId - keep track of last used vending machine id
//* id - automatically generated field
//* name


