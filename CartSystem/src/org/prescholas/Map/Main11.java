package org.prescholas.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main11 {
	// public static Map<name,quatity> cart = new Map<name,quatity>();
	//public static Map<String, Integer> cart = new HashMap<String, Integer>();
	public static Map<String ,ShoppingCart> cart = new HashMap<String ,ShoppingCart> ();
	public static String v;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println(cart);
		int quantity = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the Item:");
			v = scan.next().toLowerCase();
				if(v.equalsIgnoreCase("Exit"))
				break;
			
			System.out.println("Enter the price");
			double price = scan.nextDouble();
			System.out.println("Enter Quatity:");
			int k = scan.nextInt();
			ShoppingCart SC = new ShoppingCart(v,price,k);
			cart.put(v, SC);
			if(!(cart.containsKey(SC.getItem_name()))) {
				int q = (cart.get(v).getItem_quatity()+SC.getItem_quatity());
				ShoppingCart S = new ShoppingCart(v,cart.get(v).getItem_price(),q);
				//System.out.println(cart.get(v).getItem_price());
				cart.replace(v, SC, S);
				
			}
			else if(cart.containsKey(SC.getItem_name())) {
				cart.put(v, SC);
			}
			}
		cart.forEach((key,value)->{
			System.out.println(key+"="+value.getItem_name()+" price:"+value.getItem_price()+"Quantity: "+value.getItem_quatity());
		});
		
//			if (cart.containsKey(v)) {
//				quantity = cart.get(v) + k;
//				cart.put(v, quantity);
//				quantity = 0;
//				System.out.println(cart);
//			} else {
//				cart.put(v, k);
//				System.out.println(cart);
//			}
		//}
		add();
	}
	public static void add() {
	
		
		System.out.println("Final Print");
		//System.out.println(cart);
	}
}