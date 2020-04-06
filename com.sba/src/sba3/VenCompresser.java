package sba3;

import java.util.Scanner;

public class VenCompresser {
	//  static char previousLetter ;
		
	public static String CompressString(String input)
	{
	    String cString = new String(); 
	    int i = 0;
	    int limit = input.length() - 1;
	    char next = '\0';
	    while (i < limit)
	    {
	        int count = 1;
	        next = input.charAt(i++);
	        while (i <= limit && next == input.charAt(i))
	        {
	            count++;
	            i++;
	        }
	        cString = cString+next;
	        if (count> 1) cString=cString+count; 
	    }
	    if(i == limit)
	    {
	        cString = cString+input.charAt(i);
	        //sb.append(1);
	    }
	    return cString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner Scan = new Scanner(System.in);
      System.out.println("Enter the String:");
      String S = Scan.next();
      String x = CompressString(S);
      System.out.println("Compressed word is "+x);
	}

}
