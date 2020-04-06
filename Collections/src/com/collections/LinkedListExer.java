package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to append the specified element to the end of a linked list. 
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Hi");
		linkedList.add("Hey");
		linkedList.add("Hello");
		linkedList.add("Ola");
		linkedList.add("Vannakkam");
		System.out.println(linkedList);
		linkedList.addFirst("aaa");
		System.out.println(linkedList);
	/*	//2. Write a Java program to iterate through all elements in a linked list. Go to the editor
		Click me to see the solution

		/*3. Write a Java program to iterate through all elements in a linked list starting at the specified position. Go to the editor
		// 2 prboblem
	     for(String element: linkedList)
	    	 System.out.println(element);
		//3.prroblem
	     System.out.println("________________");
	     Iterator p = linkedList.listIterator(1);
	     while(p.hasNext()) {
	    	 System.out.println(p.next());*/
//	     }
//	    	 4. Write a Java program to iterate a linked list in reverse order. Go to the editor
	    	// Iterator p = linkedList.descendingIterator();
	    	// Iterator it = ((LinkedList<String>) linkedList).descendingIterator();
	     
	       // Print list elements in reverse order
	      //   System.out.println("Elements in Reverse Order:__________");
	      //   while(it.hasNext()) {
	        //	 System.out.println(it.next());
	        // }
	    	 
	    	 
//	    	 5. Write a Java program to insert the specified element at the specified position in the linked list. 
	      //   linkedList.add(1, "Swagatham");
	      //   System.out.println(linkedList);
	         
	         
//	    	 6. Write a Java program to insert elements into the linked list at the first and last position
	         // Add an element to front of LinkedList
	       //  ((LinkedList<String>) linkedList).addFirst("Sai");
	       //  ((LinkedList<String>) linkedList).addLast("BABA");*/
	        // linkedList.add
	      /*   System.out.println(linkedList);
	       //  7. Write a Java program to insert the specified element at the front of a linked list. 
	       //  8. Write a Java program to insert the specified element at the end of a linked list. G
	         System.out.println("element at the front");
	         ((LinkedList<String>) linkedList).offerFirst("INDIA");
	         System.out.println(linkedList);
	         
	         System.out.println("element at the end");
	         ((LinkedList<String>) linkedList).offerLast("JAYAHOOO");
	         System.out.println(linkedList);
	       //  10. Write a Java program to get the first and last occurrence of the specified elements in a linked list
	         
		 Object firstElement = ((LinkedList<String>) linkedList).getFirst();
		 System.out.println("firstelement is :");
		 System.out.println(firstElement);
		 System.out.println("last element is ");
		 Object lastElement = ((LinkedList<String>) linkedList).getLast();
		 System.out.println(lastElement);*/
		 
	}

}
