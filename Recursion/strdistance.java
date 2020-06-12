/*
 * 
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends
with sub and return its length.
strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
 */
package Recursion;

import java.util.Scanner;

public class strdistance {
	public int strDist(String str, String sub) {
	    if(str.length() < sub.length())
	        return 0;
	          
	    if(str.substring(0, sub.length()).equals(sub) &&
	        str.substring(str.length() - sub.length()).equals(sub))
	        return str.length();
	                        
	    if(!str.substring(0, sub.length()).equals(sub))
	        return strDist(str.substring(1), sub);
	                                  
	    return strDist(str.substring(0, str.length()-1), sub);
	}
	public static void main(String[] args) {
		strdistance total = new strdistance();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 System.out.print("Enter the String to be searched = ");
		 String sub = scan.next();
		 int cont = total.strDist(str, sub);
		 System.out.print("total distance between two substrings = "+ cont);

	}

}
