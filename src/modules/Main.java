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
        //[ ] Add 12 more items to snack 3 (Pretzel).
        //[ ] Print quantity of snack 3 (Pretzel).


         // [ ] Customer 1 (Jane) buys 3 of snack 4 (Soda).
		cus1.subAmount(soda.costForAmount(3));
		System.out.println(cus1.getFname() + " cash on hand " + cus1.getCashOnHand());
        soda.buySnacks(3);
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

        // [ ] Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        cus1.subAmount(pretzel.costForAmount(1));
        System.out.println(cus1.getFname() + " cash on hand " + cus1.getCashOnHand());
        pretzel.buySnacks(1);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

        //[ ] Customer 2 (Bob) buys 2 of snack 4 (Soda).
        cus2.subAmount(soda.costForAmount(2));
        System.out.println(cus2.getFname() + " cash on hand " + cus2.getCashOnHand());
        soda.buySnacks(2);
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

         //[ ] Customer 1 (Jane) finds $10.
         cus1.addAmount(10);
         System.out.println(cus1.getFname() + " cash on hand " + cus1.getCashOnHand());

        //[ ] Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
         cus1.subAmount(chocolate.costForAmount(1));
		System.out.println(cus1.getFname() + " cash on hand " + cus1.getCashOnHand());
        chocolate.buySnacks(1);
        System.out.println("Quantity of " + chocolate.getName() + " is " + chocolate.getQuantity());

        //[ ] Add 12 more items to snack 3 (Pretzel).
        pretzel.addQuantity(12);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

        //[ ] Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        cus2.subAmount(pretzel.costForAmount(3));
        System.out.println(cus2.getFname() + " cash on hand " + cus2.getCashOnHand());
        pretzel.buySnacks(3);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());


		

	}
	public static void main(String[] args)
	{
		workWithData();
	}
}