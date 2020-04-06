package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Write a Java program to append the specified element to the end of a hash set. Go to the editor
//		Click me to see the solution W3Resource.com
		Set<String> Hset = new HashSet<String>();
		Hset.add("apple");
		Hset.add("banana");
		Hset.add("grapes");
		Hset.add("Goa");
		System.out.println(Hset);//no order of elements 
		Hset.add("mango");
		System.out.println(Hset);
		
		
//
//		2. Write a Java program to iterate through all elements in a hash list. Go to the editor
//		Click me to see the solution
		
		for(String E : Hset)
			System.out.println(E);
//
//		3. Write a Java program to get the number of elements in a hash set. Go to the editor
//		Click me to see the solution
		System.out.println(Hset.size());
//
//		4. Write a Java program to empty an hash set. Go to the editor
//		Hset.removeAll(Hset);
//		System.out.println(Hset);
		
//		5. Write a Java program to test a hash set is empty or not. Go to the editor
		Hset.isEmpty();
//		6. Write a Java program to clone a hash set to another hash set. Go to the edit
//		 Set<String> A1 = new HashSet<String>();
//		  Object A = ((HashSet<String>) Hset).clone();
//		
//		  System.out.println("the clone of A1 is ");
//		  System.out.println(A);
		 
//		7. Write a Java program to convert a hash set to an array. Go to the editor
		  // create an array to convert HashSet to an aaray
		  System.out.println("Hset element sare :");
		  System.out.println(Hset);
		  String Arr[] = new String[Hset.size()];
		  Hset.toArray(Arr);
		  System.out.println("after converting hashset into Array is:");
		  for(String E : Arr)
			  System.out.println(E);
		  
		  
		  
		  
//		8. Write a Java program to convert a hash set to a tree set. Go to the editor
//		Click me to see the solution
		  
		  System.out.println("Original Hash Set: " + Hset);
		    
		     // Creat a TreeSet of HashSet elements
		     Set<String> tree_set = new TreeSet<String>(Hset);
		 
		     // Display TreeSet elements
		     System.out.println("TreeSet elements: ");
		     for(String S: tree_set)
		    	 System.out.println(S);//difference is it will diesplay apple
		     														//goa
		     //														banana etc..
		  System.out.println(tree_set);//[apple,banaban,mango]that is the diference.
		  

//		9. Write a Java program to convert a hash set to a List/ArrayList. Go to the editor
		     //convert a hashSet into ListArray
		     List<String > list = new ArrayList<String>(Hset);
		    
		    	 System.out.println(list);
//
//		10. Write a Java program to compare two hash set. Go to the editor
		    	 Set<String> HS = new HashSet<String>();
		    	 HS.add("Goa");
		    	 HS.add("APPLE");
		    	 HS.add("grapes");
		    	 HS.add("mango");
		    	 System.out.println(HS);
		    	 for(String e: Hset)
		    		 System.out.println(HS.contains(e)? "yes": "No");
//
//		11. Write a Java program to compare two sets and retain elements which are same on both sets. Go to the editor
		    	 System.out.println("Hset elements are "+Hset);
		    	 System.out.println("HS elements are "+HS);
		    	 Hset.retainAll(HS);
		    	 System.out.println("the common elements  in Hset and HS are:"+Hset);
//		12. Write a Java program to remove all of the elements from a hash set. Go to the editor
//		Click me to see the solution

		    	 HS.removeAll(HS);
		    	 System.out.println("the elemnts will be :"+HS);

	}

}
