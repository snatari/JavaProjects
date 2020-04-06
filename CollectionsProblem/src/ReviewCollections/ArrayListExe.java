package ReviewCollections;

import java.util.Scanner;

public class ArrayListExe {
	private int Tea ;
	private int  Expresso ;
	private int Cappucino;
	public static int subtotal;
	public ArrayListExe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayListExe(int tea, int expresso, int cappucino) {
		super();
		Tea = tea;
		Expresso = expresso;
		Cappucino = cappucino;
	}
	public int getTea() {
		return Tea;
	}
	public void setTea(int tea) {
		Tea = tea;
	}
	public int getExpresso() {
		return Expresso;
	}
	public void setExpresso(int expresso) {
		Expresso = expresso;
	}
	public int getCappucino() {
		return Cappucino;
	}
	public void setCappucino(int cappucino) {
		Cappucino = cappucino;
	} 
public int  SubTotal() {
	subtotal =  this.Tea+subtotal;
	System.out.println(subtotal);
	return subtotal;
	
}
	
	}


