package org.prescholas.Map;

public class ShoppingCart {
	private String item_name;
	private double item_price ;
	private int item_quatity;
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public double getItem_price() {
		return item_price;
	}
	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}
	public int getItem_quatity() {
		return item_quatity;
	}
	public void setItem_quatity(int item_quatity ) {
		this.item_quatity =item_quatity ;
	}
	public ShoppingCart() {
	}
	public ShoppingCart(String item_name, double item_price, Integer item_quatity) {
		//super();
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_quatity = item_quatity;
	}
	
	}


