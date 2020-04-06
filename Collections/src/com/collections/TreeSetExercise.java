package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set. Go to the editor
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Red");
		treeset.add("Green");
		treeset.add("Pink");
		treeset.add("Purple");
		treeset.add("Black");
		System.out.println(treeset);
		// 2problem solution
		for(String element : treeset)
			System.out.println(element);
		
		
		
//		2. Write a Java program to iterate through all elements in a tree set. Go to the editor
//		Click me to see the solution
//
//		3. Write a Java program to add all the elements of a specified tree set to another tree set. Go to the editor
		TreeSet<String> treeset1 = new TreeSet<String>();
		treeset1.addAll(treeset);
		System.out.println(treeset1);
		
//		4. Write a Java program to create a reverse order view of the elements contained in a given tree set. Go to the edi
		Iterator it = treeset.descendingIterator();
		System.out.println("print elements in reverse oreder");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		5. Write a Java program to get the first and last elements in a tree set. Go to the edit
	
		System.out.println("the first element: "+treeset.first());
		System.out.println("the second element:  "+treeset.last());
//		6. Write a Java program to clone a tree set list to another tree set. Go to the editor
		TreeSet<String> TS = (TreeSet<String>)treeset.clone();
		System.out.println(TS);
//		7. Write a Java program to get the number of elements in a tree set. Go to the edi
		System.out.println("treeset no of  elements "+treeset.size());
//		8. Write a Java program to compare two tree sets. Go to the ed
		TreeSet<String>ts1 = new TreeSet<String>();
		ts1.add("black");
		ts1.add("Green");
		ts1.add("Red");
		ts1.add("orange");
		
		for(String ele: treeset)
		System.out.println(ts1.contains(ele));
		
		
		
//		9. Write a Java program to find the numbers less than 7 in a tree set. Go to the editor
		TreeSet<Integer> treei = new TreeSet<Integer>();
		TreeSet<Integer> FindNum = new TreeSet<Integer>();
		treei.add(1);
		treei.add(2);
		treei.add(5);
		treei.add(35);
		treei.add(7);
		treei.add(12);
		treei.add(80);
		treei.add(17);
		treei.add(20);
		System.out.println(treei);
		System.out.println("find the numbers less than 7 in a tree set");
		FindNum = (TreeSet)treei.headSet(7);
		Iterator i  = FindNum.iterator();
		System.out.println("treeset data is :");
		while(i.hasNext())
			System.out.println(i.next());
		
		

//		10. Write a Java program to get the element in a tree set which is greater than or equal to the given element. Go to the e
		System.out.println("tree set which is greater than or equal to the given element "+treei.ceiling(25));
		System.out.println("tree set which is greater than or equal to the given element "+treei.ceiling(77));
//		11. Write a Java program to get the element in a tree set which is less than or equal to the given element. Go to the edito
		System.out.println("tree set which is less than or equal to the given element "+treei.floor(25));
		System.out.println("tree set which is less than or equal to the given element "+treei.floor(77));
//		12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element. Go to the editor
		System.out.println("tree set which is'strictly' greater than or equal to the given element "+treei.higher(2));
		System.out.println("tree set which is'Strictly' greater than or equal to the given element "+treei.higher(12));
//		13. Write a Java program to get an element in a tree set which is strictly less than the given element. Go to the editor
		System.out.println("tree set which is'strictly' less than or equal to the given element "+treei.lower(5));
		System.out.println("tree set which is'Strictly' less than or equal to the given element "+treei.lower(17));
//		14. Write a Java program to retrieve and remove the first element of a tree set. Go to the editor

		 System.out.println("Removes the first(lowest) element: "+treei.pollFirst());
		   System.out.println("Tree set after removing first element: "+treei);
//		15. Write a Java program to retrieve and remove the last element of a tree set. Go to the edi
		   
		   System.out.println("Removes the last element: "+treei.pollLast());
		   System.out.println("Tree set after removing last element: "+treei);
//		16. Write a Java program to remove a given element from a tree set. Go to the editor
		   
		   System.out.println(treei.remove(7));
		   System.out.println(treei);

	}

}
