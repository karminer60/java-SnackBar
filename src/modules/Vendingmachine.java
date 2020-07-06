package modules;

public class Vendingmachine
{
	private static int maxId = 0;
	public int id;
	public String name;
	public int debt;

	public Company(String name, int debt)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.debt = debt;
	}

	@Override
	public String toString()
	{
		return "Company: " + name + "debt" + 100;
	}
}