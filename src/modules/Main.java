package modules;

public class Main

{
	private static void workWithData()
	{
        
		System.out.println("Welcome to Java");
       

        //public Employee(String fname, int cashOnHand, int customerId)
		Customer cus1 = new Customer("Jane", 45.25);
		Customer cus2 =  new Customer("Bob", 33.14);

        //vending machines
        Vendingmachine food = new Vendingmachine("Food");
		Vendingmachine drink =  new Vendingmachine("Drink");
		Vendingmachine office = new Vendingmachine("Office");



        //public Snack(int vendingmachineId, String name, double cost, int quantity)
        Snack chips = new Snack(food.getId(),"chips",1.75, 36);
		Snack chocolate =  new Snack(food.getId(),"chocolate", 1.00, 36);
		Snack pretzel = new Snack(food.getId(),"pretzel",2.00, 30);
        Snack soda =  new Snack(drink.getId(),"soda",2.50, 24);
		Snack water = new Snack(drink.getId(),"water",2.75, 20);

        //processing
        System.out.println(c1);
		emp1.setSalary(emp1.getSalary() + 500)
		System.out.println(emp1.getFname() + " " + emp1.getSalary());

		System.out.println(c1.debt / 7);
		System.out.println(c1.debt % 7);
		System.out.println(c1.debt / 7.0);

		double result = (double) c1.debt / 14;


		

	}
	public static void main(String[] args)
	{
		workWithData();
	}
}