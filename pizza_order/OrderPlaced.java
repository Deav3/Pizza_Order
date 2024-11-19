package pizza_order;

public class OrderPlaced implements Orders
{
	int added=0;
	Pizza p=new Pizza();

	public int addCheese() {
		System.out.println("EXTRA CHEESE ADDED...!!!");
		added=added+p.getExtraCheese();
		return added;
	}

	
	public int addToppings() {
		System.out.println("EXTRA TOPPINGS ADDED...!");
		added=added+p.getExtraToppings();
		return added;
	}

	
	public void withdraw(int choice, double amt) {
		switch(choice) {
		case 1:{
			if(amt>=p.getPizza()) {
				double balance=amt-p.getPizza();
				System.out.println("REMAINING BALANCE:"+balance);
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO ORDER..!");
			}
			break;
		}
		case 2:{
			if(amt>=p.getChickenPizza()) {
				double balance=amt-p.getChickenPizza();
				System.out.println("REMAINING BALANCE:"+balance);
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO ORDER..!");
			}
			break;
		}
		case 3:{
			if(amt>=p.getOnionPizza()) {
				double balance=amt-p.getOnionPizza();
				System.out.println("REMAINING BALANCE:"+balance);
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO ORDER..!");
			}
			break;
		}
		case 4:{
			if(amt>=p.getTandooriChickenPizza()) {
				double balance=amt-p.getTandooriChickenPizza();
				System.out.println("REMAINING BALANCE:"+balance);
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO ORDER..!");
			}
			break;
		}
		case 5:{
			if(amt>=p.getDoubleCheesePizza()) {
				double balance=amt-p.getDoubleCheesePizza();
				System.out.println("REMAINING BALANCE:"+balance);
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO ORDER..!");
			}
			break;
		}
		}
		
	}
	

}
