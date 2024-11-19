package pizza_order;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args)
	{
		Pizza p = new Pizza();
		int added=0;
		OrderPlaced op=new OrderPlaced();
		boolean b=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO dELICIOUS PIZZA STORE...!");
		System.out.println("WOULD U LIKE TO SEE THE MENU..!");
		String ans=sc.next();
		
		if(ans.equalsIgnoreCase("yes")) {
			System.out.println("TODAY AVAILABLE PIZZA'S IN THE MENU");
			System.out.println(p);
			do {
				System.out.println("WOULD U LIKE TO ORDER...ENTER THE NUMBER(1,2,3,4,5)...");
				int num=sc.nextInt();
				System.out.println("WOULD U LIKE TO ORDER IT...");
				String reply=sc.next();
				if(reply.equalsIgnoreCase("yes")) {
					System.out.println("WOULD U LIKE TO ADD EXTRA CHEESE(RS.30/-)9");
					String ans1=sc.next();
					if(ans1.equalsIgnoreCase("yes")) {
						added=op.addCheese();
					}
					System.out.println("WOULD U LIKE TO ADD EXTRA TOPPINGS (RS.30/-)");
					String ans2=sc.next();
					if(ans2.equalsIgnoreCase("ans2")) {
						added=op.addToppings();
					}
					System.out.println("ENTER THE AVAILABLE AMOUNT");
					double amt=sc.nextDouble();
					amt=amt-added;
					op.withdraw(num, amt);
					b=false;
					System.out.println("THANK YOU FOR VISITING ...!  VISIT US AGAIN....");
				}
				else {
					System.out.println("WOULD U LIKE TO SEE THE MENU AGAIN..!");
					String ans3=sc.next();
					if(ans3.equalsIgnoreCase("yes")) {
						System.out.println(p);
					}
					else {
						System.out.println("THANK U...");
						b=false;
					}
				}
			}while(b);
		}
		else {
			System.out.println("THANK U VISIT US AGAIN");
		}
		
		

	}

}
