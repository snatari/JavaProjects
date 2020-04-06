package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Write a Java program to associate the specified value with the specified key in a HashMap. Go to the editor
			HashMap<Integer,String>hashMap = new HashMap<Integer,String >();
			hashMap.put(1,"A");
			hashMap.put(2,"B");
			hashMap.put(3,"C");
			hashMap.put(4,"D");
			hashMap.put(5,"E");
			hashMap.put(6,"F");
			System.out.println(hashMap);
			for(Map.Entry X :hashMap.entrySet())  
				   System.out.println(X.getKey()+" "+X.getValue());
				   
		
//		2. Write a Java program to count the number of key-value (size) mappings in a map. Go to the edito
//			System.out.println("Hashmap size for key and values are : " +hashMap.size());
//			
//			
//			
////		3. Write a Java program to copy all of the mappings from the specified map to another map. Go to the editor
//			HashMap<Integer,String>hashMap1 = new HashMap<Integer,String >();
//			hashMap1.putAll(hashMap);
//			System.out.println(hashMap1);
//			for(Map.Entry Y : hashMap1.entrySet())
//				System.out.println(Y.getKey()+" "+Y.getValue());
////		4. Write a Java program to remove all of the mappings from a map. Go to the edito
////			hashMap.clear();
////			hashMap.isEmpty();
////			System.out.println(hashMap);
////		5. Write a Java program to check whether a map contains key-value mappings (empty) or not. Go to the editor
//			System.out.println("is hashMap empty "+hashMap.isEmpty());
//			hashMap.clear();
//			 boolean B =hashMap.isEmpty();
//			System.out.println("is hashMap empty "+hashMap.isEmpty());
////		6. Write a Java program to get a shallow copy of a HashMap instance. Go to the editor
//			
//
////		7. Write a Java program to test if a map contains a mapping for the specified key. Go to the edit
			  HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
			  hash_map.put("Red", 1);
		  hash_map.put("Green", 2);
		  hash_map.put("Black", 3);
			  hash_map.put("White", 4);
		  hash_map.put("Blue", 5);
//			  // print the map
//			  System.out.println("The Original map: " + hash_map);
//			  if(hash_map.containsKey("Green")) {
//				  System.out.println("Yes ! the Key  exists "+hash_map.get("Green"));
//			  }else 
//				  System.out.println("no!");
//			  
//			  if(hash_map.containsKey("Orange")) {
//				  System.out.println("Yes ! the Key  exists "+hash_map.get("Orange"));
//			  }else 
//				  System.out.println("no!");
//			  
////		8. Write a Java program to test if a map contains a mapping for the specified value. Go to the editor
//
//			  if(hashMap.containsValue("A")) {
//				  System.out.println("Yes ! the Key  exists ");
//			  }else 
//				  System.out.println("no!");
////		9. Write a Java program to create a set view of the mappings contained in a map. Go to the ed
//			  Set set = hash_map.entrySet();
//			  System.out.println("the Set values are: "+ set);
//			  
//		10. Write a Java program to get the value of a specified key in a map. Go to the editor
			 String result =  hashMap.get(3);
			 
			  System.out.println("yhe result is: "+result);
			  
//		11. Write a Java program to get a set view of the keys contained in this map. Go to the ed
			  Set set1 = hash_map.keySet();
			  System.out.println("the keysets are : "+set1);
//		12. Write a Java program to get a collection view of the values contained in this map. Go to the editor
			  	System.out.println("the collection view map is "+ hash_map.values());

	}

}
