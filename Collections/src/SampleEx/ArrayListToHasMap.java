package SampleEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayListToHasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> StudName = new ArrayList<String>();
		ArrayList<Integer> StudScore = new  ArrayList<Integer>();
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter  yes:");
		String option = Scan.next();
		while(!option.equals("quit")) {
			System.out.println("Enter the Student name:");
			  String  Name = Scan.next();
			System.out.println("Enter the student Score:");
			int  Score  = Scan.nextInt();
			System.out.println("do you want to addo more students? say yes or quit");
			option = Scan.next();
		StudName.add(Name);
		StudScore.add(Score);
	}
		Scan.close();
		System.out.println(StudName);
		System.out.println(StudScore);
		HashMap<String ,Integer> StudGradeA  = new HashMap<String, Integer>();
		HashMap<String ,Integer> StudGradeB  = new HashMap<String, Integer>();
		HashMap<String ,Integer> StudGradeC  = new HashMap<String, Integer>();
		HashMap<String ,Integer> StudGradeF  = new HashMap<String, Integer>();
		for(int i=0;i<StudName.size();i++) {
		//for(int j=0;j<StudScore.size();j++) {
			if(StudScore.get(i)>=95&&StudScore.get(i)<=100) {
				
			StudGradeA.put(StudName.get(i), StudScore.get(i));
					
			}
			else if(StudScore.get(i)>=85&&StudScore.get(i)<95) {
				StudGradeB.put(StudName.get(i), StudScore.get(i));
					
					
			}
				else if(StudScore.get(i)>=75&&StudScore.get(i)<85) { 
					StudGradeC.put(StudName.get(i), StudScore.get(i));
						
				}
				else if(StudScore.get(i)>=65&&StudScore.get(i)<75) {
					StudGradeF.put(StudName.get(i), StudScore.get(i));
							
			}
		}
			StudGradeA.forEach((keys,values) ->{
				System.out.println(keys +" : "+ values+" GradeA");
			});
			StudGradeB.forEach((keys,values) ->{
				System.out.println(keys +" : "+ values+" GradeB");
			});
			StudGradeC.forEach((keys,values) ->{
				System.out.println(keys +" : "+ values+" GradeC");
			});
			StudGradeF.forEach((keys,values) ->{
				System.out.println(keys +" : "+ values +" GradeF");
			});
			
			

}
}