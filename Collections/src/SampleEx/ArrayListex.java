package SampleEx;

import java.util.ArrayList;

public class ArrayListex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String > shopping = new ArrayList<String >();
		shopping.add("soaps ,2");
		shopping.add("paste ,3");
		shopping.add("brush ,4");
		shopping.add("Gel ,3");
		String temp;

		for(int i=0;i<shopping.size();i++) {
				temp = shopping.get(i);
				String tempArray[] = temp.split(",");
				System.out.println(tempArray[0].trim()+" : "+tempArray[1].trim());	
		}
		

	}

}
