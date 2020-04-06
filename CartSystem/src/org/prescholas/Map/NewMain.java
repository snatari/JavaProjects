package org.prescholas.Map;

import java.util.HashMap;
import java.util.Scanner;

public class NewMain {
	public static HashMap<String,Integer> cart = new HashMap<String ,Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart s = new ShoppingCart();
//		HashMap<String,Integer> cart = new HashMap<String ,Integer>();
		Scanner Scan = new Scanner(System.in);
		String option;
		do {
			System.out.println("Enter the name:");
			s.setItem_name(Scan.next());
			System.out.println("Enter the quantity");
			s.setItem_quatity(Scan.nextInt());
			boolean b = add(s);
			System.out.println("Cart values: "+cart);
			System.out.println("Add more items to the cart?Y/N");
			 option = Scan.next();	
		} while (!option.equalsIgnoreCase("N"));
		System.out.println("Thank You for shopping with us!!");
		Scan.close();
	}
		

	
	public static boolean add(ShoppingCart s) {
	if(cart.containsKey(s.getItem_name())) {
		int totalquantity = s.getItem_quatity()+cart.get(s.getItem_name());
		cart.replace(s.getItem_name(),totalquantity );
		
	}else {
		cart.put(s.getItem_name(),s.getItem_quatity());
		System.out.println(cart);
	}
		return true;
		
	}
}
