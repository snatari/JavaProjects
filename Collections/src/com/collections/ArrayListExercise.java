package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to create a new array list, add some colors (string) and print out the collection.
		 ArrayList<String>Al = new ArrayList<String>();
		  Al.add("red");
		  Al.add("white");
		  Al.add("blue");
		  Al.add("Yellow");
		  Al.add("Purple");
		  
		  System.out.println(Al);
//		 //2. Write a Java program to iterate through all elements in a array list. //		  
//			  for(String element :Al) {
//				  System.out.println(element);
//			  }
//				 // 3. Write a Java program to insert an element into the array list at the first position.
//				  Al.add(0, "orange");
//				  System.out.println(Al);
//				//  4. Write a Java program to retrieve an element (at a specified index) from a given array list. 
//				  System.out.println(Al.get(0));
//				  System.out.println(Al.get(2));
//				  System.out.println("------------");
//				  //or u can like this to retrieve an element
//				  String element = Al.get(0);
//				  System.out.println(element);
//				  element = Al.get(2);
//				  System.out.println(element);
//				  System.out.println("//////////////");
//				 // 5. Write a Java program to update specific array element by given element.
//				  Al.set(1, "Gray");
//				System.out.println(Al);
//			//	6. Write a Java program to remove the third element from a array list
//				Al.remove(3);
//				System.out.println(Al);
//				//7. Write a Java program to search an element in a array list.
//				System.out.println(Al.contains("green"));//true/false
//				//8. Write a Java program to sort a given array list.
//				System.out.println("before Sort is :"+ Al);
//				Collections.sort(Al);
//				 System.out.println("After Sort is : "+Al);
//				 //7. Write a Java program to copy one array list into another.
//			List<String> Bl = new ArrayList<String>();
//			Bl.add("A");
//			Bl.add("B");
//			Bl.add("C");
//			//Bl.add("D");
//			System.out.println(Bl);
//			System.out.println("before copy :"+Al);
//			Collections.copy(Al,Bl);
//			System.out.println("After copy :"+Al);
//			System.out.println(Bl);
			//8. Write a Java program to shuffle elements in a array list.
//			 
			//9. Write a Java program to reverse elements in a array list. 
			Collections.reverse(Al);
			System.out.println("after reverse is : "+Al);
			//12. Write a Java program to extract a portion of a array list. 
			System.out.println("before extract :"+Al);
			    List<String> subList =Al.subList(0, 3);//it returns index before 3index;
			   System.out.println(subList);
			
//			   13. Write a Java program to compare two array lists. Go to the editor

			   ArrayList<String> c1= new ArrayList<String>();
			   	c1.add("Red");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Pink");
//
	          ArrayList<String> c2= new ArrayList<String>();
		          c2.add("Red");
		          c2.add("Green");
		          c2.add("Black");
		          c2.add("Pink");
		          ArrayList<String> c3= new ArrayList<String>();
//		        //Storing the comparison output in ArrayList<String>
//		          for(String element : c1)
//		        	  c3.add(c2.contains(element)? "Yes":"No");
//		         // c3.add(c2.contains(c1)? "Yes":"No"); this way does not working!
//		          System.out.println(c3);
//			   14. Write a Java program of swap two elements in an array list
//		          List<String>c1 = new ArrayList<String>();
//		          c1.add("Red");
//		          c1.add("Green");
//		          c1.add("Black");
//		          c1.add("White");
//		          c1.add("Pink");
//		          System.out.println( "before swap: ");
//		          for(String E : c1)
//		          System.out.println(E);
//		          
//		        //Swapping 1st(index 0) element with the 3rd(index 2) element
//		          Collections.swap(c1, 0, 3);
//		          System.out.println( "after swap: ");
//		          for(String S: c1)
//		          
//		         System.out.println( S);
//			   15. Write a Java program to join two array lists. Go to the editor
//			   Click me to see the solution
		          // 13 th plus
		          c3.addAll(c1);
		          c3.addAll(c2);
		          System.out.println(c3);
	
//			   16. Write a Java program to clone an array list to another array list. 
		          List<String>A = (ArrayList<String>)c1.clone();
		          System.out.println("the new clone list A is:");
		        		  System.out.println(A);
		          
		          
		          
//			   17. Write a Java program to empty an array list. Go to the editor
//			   Click me to see the solution
//		        		   System.out.println("ArrayList of c2 is ");
//		        		   System.out.println(c2);
//		        		  System.out.println(c2.isEmpty()); // 18 th problem 
//		        		   c2.removeAll(c2);
//		        		   
//		        		  System.out.println(" we removed all elementes in c2 is : "+ c2);
		        		   
//			   18. Write a Java program to test an array list is empty or not. Go to the editor
//			   Click me to see the solution
//
//			   19. Write a Java program to trim the capacity of an array list the current list size. Go to the editor
//			   Click me to see the solution

		        	c2.trimToSize();
		        	System.out.println(c2);
		        		  
//			   20. Write a Java program to increase the size of an array list. Go to the editor
//			   Click me to see the solution
		        	System.out.println("Before array size of c2 is "+c2.size());
		        		  c2.add("swathi");
		        		  c2.add("Bangaaru");
		        		  System.out.println(c2);
		        		  System.out.println("After adding two new elements of c2 is: "+c2.size());
		        		  
//			   21. Write a Java program to replace the second element of a ArrayList with the specified element. Go to the editor
//			   Click me to see the solution
               c2.set(2, "Hello");
               System.out.println(c2);
		        		  
//			   22. Write a Java program to print all the elements of a ArrayList using the position of the elements. Go to the editor
               System.out.println(" array  of c2 is "+c2);
               for(int indexi =0;indexi<c2.size();indexi++)
            	   System.out.println("index is : "+indexi+ " "+ c2.get(indexi));
               
               
			 
					  }
		  } 
	


