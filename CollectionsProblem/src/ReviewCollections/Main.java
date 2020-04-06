package ReviewCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExe s = new ArrayListExe();
		s.setTea(2);
		s.setExpresso(3);
		s.setCappucino(4);
		
		
		List<Integer> list = new ArrayList<Integer>();
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the no:to enter into loop");
		int x= Scan.nextInt();
			System.out.println("Menu Options are:1.Tea\n2.Expresso\n3.cappucino\n4.quit");
			System.out.println("enter the number:");
			int option =Scan.nextInt();
			int Quantity =0;
			while(option!=5) {
				
			if(option==1) {
				System.out.println("you orderd Tea how much quantity");
				 Quantity = Scan.nextInt();
				int total =s.getTea()*Quantity;
				int subtotal1 = 0;
				 subtotal1 = total+subtotal1;
					//System.out.println(subtotal1);
				System.out.println("Tea " +subtotal1);
				//list.add(Quantity);
			
				break;
						//System.out.println("Tea " +total);
			}//int subtotal = 0;
			if(option==2) {
				System.out.println("how much quantity u want");
				//int subtotal;
				Quantity = Scan.nextInt();
				int total =s.getExpresso()*Quantity;
				
			System.out.println("Menu Options are:1.Tea\n2.Expresso\n3.cappucino\n4.quit");
			option =Scan.nextInt();
			}
			if(option==3) {
				System.out.println("how much quantity u want");
				Quantity = Scan.nextInt();
				int total =s.getCappucino()*Quantity;
				System.out.println(total);
			System.out.println("Menu Options are:1.Tea\n2.Expresso\n3.cappucino\n4.quit");
			option =Scan.nextInt();
	}
			if(option ==4) {
				System.out.println("thank You ! you choosed to exit!");
				break;
			}
			
			}
			System.out.println("Menu Options are:1.Tea\n2.Expresso\n3.cappucino\n4.quit");
			option =Scan.nextInt();//list.add(Quantity);
	}
}

