package SampleEx;

import java.util.LinkedList;

public class LinkedListExer {
// adding two LinkedList a& b  in an other LinkedList c.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String > a = new LinkedList<String>();
		a.add("red");
		a.add("blue");
		a.add("pink");
		a.add("yellow");
		System.out.println("the first LinkedList is : "+a);
		
		LinkedList<String > b = new LinkedList<String>();
		b.add("white");
		b.add("orange");
		b.add("black");
		b.add("green");
		System.out.println("the second LinkedList is : "+b);
		LinkedList<String > c = new LinkedList<String>();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c);
		
		
	}

}
