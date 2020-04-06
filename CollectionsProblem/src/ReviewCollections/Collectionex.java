package ReviewCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collectionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tea = 2;
		int cappucino = 4;
		int expresso = 3;
		String itemName = null;
		int quantity = 0;
		int option;
		int total = 0;
		int subtotal = 0;
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> order = new HashMap<String, Integer>();
		System.out.println("Menu Options are:1.Tea\n2.Expresso\n3.cappucino\n4.quit");
		System.out.println("Do u want to order yes/no");
		String s = scan.next();
		while (s.equals("yes")) {
			System.out.println("Enter the option");
			option = scan.nextInt();
			if (option == 1) {
				itemName = "Tea";
				if (order.containsKey("Tea"))
					subtotal = order.get("Tea");
					else subtotal = 0;
				System.out.println("Enter the tea quantity");
				quantity = scan.nextInt();
				total = tea * quantity;
				subtotal += total;
				System.out.println("Tea " + subtotal);
				order.put(itemName, subtotal);
			}

			if (option == 2) {
				total = 0;
				// subtotal =0;
				if (order.containsKey("Expresso")) 
					subtotal = order.get("Expresso");
					else subtotal = 0;
				itemName = "Expresso";
				System.out.println("Enter the Expresso quantity");
				quantity = scan.nextInt();
				total = expresso * quantity;
				System.out.println("total is " + total);
				subtotal += total;
				System.out.println("Expresso subtotal is:" + subtotal);
				order.put(itemName, subtotal);
			}

			if (option == 3) {
				total = 0;
				itemName = "Cappuccino";
				if (order.containsKey("Cappuccino"))
					subtotal = order.get("Cappuccino");
				else subtotal = 0;
				System.out.println("Enter the Cappucino quantity");
				quantity = scan.nextInt();
				total = cappucino * quantity;
				System.out.println("total is :" + total);
				subtotal += total;
				System.out.println("Cappuccino " + subtotal);
				order.put(itemName, subtotal);
			}
			if (option == 4) {
				System.out.println("You choosed to Exit");
				System.out.println("Thank you!");

			}
			System.out.println("Menu Options are:1.Tea\n2.Expresso\n3.cappucino\n4.quit");
			System.out.println("Do u want to order yes/no");
			s = scan.next();
		}
		order.put(itemName, subtotal);
		for (Map.Entry<String, Integer> entry : order.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
//	public void Total() {
//		int itemName;
//		int quantity;
//		Object total = *quantity;
//		System.out.println(total);
//	}

}
