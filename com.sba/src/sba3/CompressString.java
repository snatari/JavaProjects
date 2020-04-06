package sba3;

import java.util.Scanner;

public class CompressString {
	
public static String CompressString(String str)
	{
	   String cString = new String(); 
	    int i = 0;
	    int limit = str.length() - 1;
	    char next = ' ';
	    while (i < limit)
	    {
	        int count = 1;
	        next = str.charAt(i++);
	        while (i <= limit && next == str.charAt(i))
	        {
	            count++;
	            i++;
	        }
	        cString = cString+next;
	        if (count> 1) cString=cString+count; 
	    }
	    if(i == limit)
	    {
	        cString = cString+str.charAt(i);
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

