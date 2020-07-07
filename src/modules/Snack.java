package modules;

public class Snack
{
	private static int maxId = 0;

	private int id;
    private int vendingmachineId;
	private String name;
    private double cost;
    private int quantity; 

	public Snack(int vendingmachineId, String name, double cost, int quantity)
	{
		maxId++;
		id = maxId;
		this.name = name;
        this.vendingmachineId = vendingmachineId;
        this.cost = cost;
        this.quantity = quantity;
	}

	public int getId()
	{
		return id;
	}
      public int getVendingmachineId()
	{
		return vendingmachineId;
	}

	public void setVendingmachineId(int vendingmachineId)
	{
		this.vendingmachineId = vendingmachineId;
	}

	public String getName()
	{
		return name;
	}

    public void setName(String name)
	{
		this.name = name;
	}

    public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

    public int getQuantity()
	{
		return quantity;
	}

    
    public void buySnacks(int amountBought)
	{
		this.quantity -= amountBought;
	}

    public void addQuantity(int amount)
	{
		this.quantity  += amount;
	}
    public double costForAmount(int amount )
	{
		return this.cost *  amount;
	}
}


//* id - automatically generated field
//* name
//* quantity
//* cost
//* vending machine id
//add quantity when given how many to add
//buy snack when given how many to buy
//get total cost given a quantity