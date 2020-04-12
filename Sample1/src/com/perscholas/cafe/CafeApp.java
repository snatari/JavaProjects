package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {
//	int coffee = 2;
//	int espresso = 3;
//	int cappuccino= 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"coffee", "espresso" and "cappuccino".
		Product Empty = new Product();
		Product P = new Product("coffee",2,"Hot !");
		Product P1 = new Product("expresso",3,"SweetMilk !");
		Product P2 = new Product("cappuccino",4,"caramel milk !");
		Scanner scan = new Scanner(System.in);
		System.out.println("the menu is :\n 1.coffee\n2.espresso\n3.cappuccino\n4.exit");
		System.out.println("select the menu");
		int option = scan.nextInt();
		int quantity = 0;int quantity1 = 0;int quantity2 = 0;
		while(option!=4) {
		//System.out.println("the menu is :\n 1.coffee\n2.espresso\n3.cappuccino\n4.exit");
			switch(option) {
			case 1:
				System.out.println("u selected coffee");
//				System.out.println(P.getName()+P.getPrice()+P.getDescription()+P.getQuantity());
				System.out.println(" Enter how much quantity u want?");
			//Empty.setQuantity(quantity); 
			 quantity = scan.nextInt();
			//Empty.setQuantity(quantity);
				//P.calculateProductTotal();
			double subtotal = quantity*P.getPrice();
				System.out.println(P.getName()+P.getPrice()+P.getDescription()+quantity+"subtotal is : "+subtotal);
				
				
				break;
			case 2:
				System.out.println("u selected expresso");
				System.out.println(" Enter how much quantity u want?");
				quantity1 = scan.nextInt();
				double subtotal1 = quantity*P1.getPrice();
				System.out.println(P1.getName()+P1.getPrice()+P1.getDescription()+quantity1+"subtotal1 is : "+subtotal1);
				
				break;
			case 3:
				System.out.println("u selected cappuccino");
				System.out.println(" Enter how much quantity u want?");
				quantity2 = scan.nextInt();
				double subtotalSS = quantity*P2.getPrice();
				System.out.println(P2.getName()+P2.getPrice()+P2.getDescription()+quantity2+"subtotalSS is : "+subtotalSS);
				
				break;
			
			}
			System.out.println("the menu is :\n 1.coffee\n2.espresso\n3.cappuccino\n4.exit");
			System.out.println("select the menu to order more");
			option = scan.nextInt();
		}
			System.out.println("u choosed to exit!");
	
		
		System.out.println(" Toatl ur order list is :");
		System.out.println(P.getName()+P.getPrice()+P.getDescription()+quantity);
		System.out.println(P1.getName()+P1.getPrice()+P1.getDescription()+quantity1);
		System.out.println(P2.getName()+P2.getPrice()+P2.getDescription()+quantity2);
		
//		int quantity = scan.nextInt();
//		System.out.println(P.getName()+P.getPrice()+P.getDescription());
	}
}

