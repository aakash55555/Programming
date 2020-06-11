/*
 * 
Given a string, compute recursively a new string where identical
chars that are adjacent in the original string are separated from each other by a "*".
pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
 */
package Recursion;

import java.util.Scanner;

public class pairStar {
	public String Star(String str) {
		  if(str.length() <= 1){
		    return str;
		  }
		  if(str.charAt(0) == str.charAt(1)){
		    return str.charAt(0)+ "*"+ Star(str.substring(1));
		  }
		  return str.charAt(0) + Star(str.substring(1));
		}

	public static void main(String[] args) {
		pairStar count = new pairStar();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 String cont = count.Star(str);
		 System.out.print("count = "+ cont);

	}
}
