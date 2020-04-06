package com.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Write a Java program to associate the specified value with the specified key in a Tree Map. Go to the editor
		TreeMap<Integer,String> tree_map = new TreeMap<Integer,String>();
		tree_map.put(1, "dog");
		tree_map.put(2, "cat");
		tree_map.put(3, "rabbit");
		tree_map.put(4, "rat");
		tree_map.put(5, "lion");
		tree_map.put(6, "Tiger");
		System.out.println(tree_map);
		System.out.println("TreeMap keys and values are ");
		for(Map.Entry<Integer,String> entry : tree_map.entrySet())
		
		System.out.println( entry.getKey()+" "+entry.getValue());
		
//		2. Write a Java program to copy a Tree Map content to another Tree Map. Go to the edi
//		TreeMap<Integer,String> tree_map1 = new TreeMap<Integer,String>();
//		tree_map1.putAll(tree_map);
//		System.out.println("the copied from one treemap to other map is:");
//		System.out.println(tree_map1);
//		for(Map.Entry<Integer,String> entry : tree_map1.entrySet())
//			
//			System.out.println( entry.getKey()+" "+entry.getValue());
////		3. Write a Java program to search a key in a Tree Map. Go to the editor
//		boolean result = tree_map.containsKey(5);
//		System.out.println("contains key ? "+ result);
//		
////		4. Write a Java program to search a value in a Tree Map. Go to the editor
//		boolean result1 = tree_map.containsValue("rat");
//		System.out.println("contains Value ? "+ result1);
////		5. Write a Java program to get all keys from the given a Tree Map. Go to the edito
//		Set<Integer> set = tree_map.keySet();
//		System.out.println("all keyset are : "+set);
////		6. Write a Java program to delete all elements from a given Tree Map. Go to the e
//		System.out.println("original map is ");
//		System.out.println(tree_map);
//		tree_map.clear();
//		System.out.println("after removing all keys and values");
//				System.out.println(tree_map);
//		7. Write a Java program to sort keys in Tree Map by using comparator. Go to the edito
				
				
				
//		8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. Go to the editor
				System.out.println("the Greatest key is "+tree_map.firstEntry());
				System.out.println("the Least key is "+tree_map.lastEntry());
				
				
//		9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map. Go to the edi
				
//				System.out.println("the first key is "+tree_map.firstKey());
//				System.out.println("the Last key is "+tree_map.lastKey());
//				
//		10. Write a Java program to get a reverse order view of the keys contained in a given map. Go to the edito
				System.out.println("the orignal order is : "+tree_map);
				System.out.println("the reversed order is :"+tree_map.descendingKeySet());
//		11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key. Go to the edito
				TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
				  // Put elements to the map 
				  tree_map1.put(10, "Red");
				  tree_map1.put(20, "Green");
				  tree_map1.put(40, "Black");
				  tree_map1.put(50, "White");
				  tree_map1.put(60, "Pink");

				  System.out.println("Orginal TreeMap content: " + tree_map1);
				  System.out.println("Checking the entry for 10: ");
				  System.out.println("Value is: " + tree_map1.floorEntry(10));
				  System.out.println("Checking the entry for 30: ");
				  System.out.println("Value is: " + tree_map1.floorEntry(30));
				  System.out.println("Checking the entry for 70: ");
				  System.out.println("Value is: " + tree_map1.floorEntry(70));
//		12. Write a Java program to get the greatest key less than or equal to the given key. Go to the editor
//		Click me to see the solution
//  same as bove 'floorKey' 
//		13. Write a Java program to get the portion of a map whose keys are strictly less than a given key. Go to the editor
//		Click me to see the solution
// same as above 'headMap'
//		14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key. Go to the editor
//		Click me to see the solution
// same as above'headMap(20,true)
//		15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key. Go to the editor
//		Click me to see the solution
//same as above 'higherEntry'
//		16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key. Go to the editor
//		Click me to see the solution
				//  same as above 'lowerEntry'	  
//
//		17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key. Go to the editor
//		Click me to see the solution
//
				  
				  
//		18. Write a Java program to get NavigableSet view of the keys contained in a map. Go to the e
				// all answers in W3resource/java/exercise     
				  
				  
				  
//		19. Write a Java program to remove and get a key-value mapping associated with the least key in a map. Go to the editor
//		Click me to see the solution
//
//		20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map. Go to the editor
//		Click me to see the solution
//
//		21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive). Go to the editor
//		Click me to see the solution
//
//		22. Write a Java program to get the portion of a map whose keys range from a given key to another key. Go to the editor
//		Click me to see the solution
//
//		23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key. Go to the editor
//		Click me to see the solution
//
//		24. Write a Java program to get a portion of a map whose keys are greater than to a given key. Go to the editor
//		Click me to see the solution
//
//		25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key. Go to the editor
//		Click me to see the solution
//
//		26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key. Go to the editor
//		Click me to see the solution
//
//		Java Practice online

	}

}
