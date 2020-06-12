/*
 * 
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
 */
package Recursion;

import java.util.Scanner;

public class allstar {
	public String allStar(String str) {
		  if(str.length() <= 1){
		    return str;
		  }
		return str.charAt(0) + "*" + allStar(str.substring(1));
		}
	public static void main(String[] args) {
		allstar total = new allstar();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 String new_str = total.allStar(str);
		 System.out.print("new string formed = "+ new_str);

	}

}
