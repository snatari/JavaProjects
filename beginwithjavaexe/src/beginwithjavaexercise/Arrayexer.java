package beginwithjavaexercise;

import java.util.Scanner;

public class Arrayexer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
//		Write Java statements that do the following:
//		a) Declare an array numArray of 15 elements of type int. 
//		b) Output the value of the tenth element of the array alpha. 
//		c) Set the value of the fifth element of the array alpha to 35. 
//		d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha. 
//		int numArray[] = new int[15];
//		int alpha[] = new int[15];
//		alpha[5]=35;
//		alpha[9]= alpha[6]+alpha[13];
//		System.out.println("the tenth element in array is "+alpha[10]);
		
		
		
//		a) Write a statement that declares a string array initialized with the following strings: 
//			"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday". 
//			b) Write a loop that displays the contents of each element in the array that you declared.
			String Array[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
			for(int i=0;i<Array.length;i++) {
				System.out.println(Array[i]);
			}
	//Write a program that creates an array of 10 elements size. 
	//Your program should prompt the user to input numbers in array and then display the sum of all array elements.
			int A[]=new int[10];
			Scanner SCan = new Scanner(System.in);
			System.out.println("Enter the values:");
			for(int i=0;i<A.length;i++) {
			A[i]= SCan.nextInt();
		
	//System.out.println("Array values are: "+A[i]);
			}for(int i=0;i<A.length;i++) {
				System.out.println(A[i]);
				 sum = sum +A[i];
			}System.out.println("sum of all elements in Array is : "+sum);
			}
}
