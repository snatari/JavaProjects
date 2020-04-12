package com.perscholas.cafe;

public class Product {
	 private String name;
	 private int  price; 
	 private String description; 
	 private int quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	public void calculateProductTotal( ) {
		// which calculates the product subtotal for the order. 
		//int count=0;
	//	double subtotal ;
		 double subtotal =this.quantity* this.price;
		System.out.println("subtotal is: "+subtotal);
		//subtotal++;
		//count++;
		
	}

}
