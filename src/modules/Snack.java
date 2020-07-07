package modules;

public class Snack
{
	private static int maxId = 0;

	private int id;
    private int VendingmachineId;
	private String name;
    private int cost;
    private int quantity; 

	public Snack(int id, int VendingmachineId, String name, int cost, int quantity)
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

    

    public void buySnacks(int amountBought)
	{
		this.quantity -= amountBought;
	}

    public void addQuantity(int amount)
	{
		this.quanity  += amount;
	}
    public int costForAmount(int amount )
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