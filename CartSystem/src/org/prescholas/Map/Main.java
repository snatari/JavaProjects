package org.prescholas.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Map<Integer,String> cart = new HashMap<Integer,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart SC = new ShoppingCart();
		add();
//		Map<Integer,String> cart = new HashMap<Integer,String>();
//		cart.put(1, "Apple");
//		cart.put(2, "Mango");
//		cart.put(3, "Berry");
//		cart.put(4, "Kiwi");		
//		cart.put(5, "Grapes");
//		System.out.println(cart);
//		for(int i=0;i<cart.size();i++) {
//			System.out.println(cart.keySet()+" "+cart.values());
//			
//		}
//		
//	}
//	//Scanner scan = new Scanner(System.in);
//	//System.out.println("enter the keys and values:");
//	
//	
//         public static void add() {
//        	 Scanner scan = new Scanner(System.in);
//     		System.out.println("enter the keys and values:");
//     		int Item_quatity =0;
//     		for(int i=0;i<3;i++) {
//     		int k = scan.nextInt();
//     		String v= scan.next();
//     		//cart.put(k,v);
//     		if(cart.containsValue(v)) {
//     			Item_quatity++;
//     			System.out.println("item quantity incremented!");
//     			//System.out.print(cart.put(k,v));
//     			
//     		}
//     		
//         }
//     		cart.forEach((key ,value)->{
//     			System.out.println(key+"="+value);
//     		});
//     			
//     		}
//         }
	//	if (cart.containsKey(v)) {
//			quantity = cart.get(v) + k;
//			cart.put(v, quantity);
//			quantity = 0;
//			System.out.println(cart);
//		} else {
//			cart.put(v, k);
//			System.out.println(cart);
//		}
	//}
	}
public static void add() {

	
	System.out.println("Final Print");
	System.out.println(cart);
}
	}

         