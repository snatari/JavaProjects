package sba3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<String>();
		String S = null;
		int x=1;
		//while(x<=3) {
			Scanner Scan = new Scanner(System.in);
			System.out.println("Enter the String:");
			 S = Scan.next();
			 str.add(S);
			//x++;
		//} 
			 int i;
			for(i=0;i<str.size();i++) {
				int count =1;
				while(i<str.size()-1 && S.charAt(i) == S.charAt(i+1)) {
					count++;
					i++;}
			
			System.out.println(S.charAt(count));
	}

}
}