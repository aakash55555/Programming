/*
 * 
Given a string, compute recursively a new string where all the lowercase 'x' chars 
have been moved to the end of the string.
endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
 */
package Recursion;

import java.util.Scanner;

public class endx {
	public String endX(String str) {
		  if(str.length() == 0){
		    return str;
		  }
		  if(str.charAt(0) == 'x'){
		    return endX(str.substring(1)) + str.charAt(0);
		  }
		  return str.charAt(0) + endX(str.substring(1));
		}
	public static void main(String[] args) {
		endx modify = new endx();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 String new_str = modify.endX(str);
		 System.out.print("Modified String = "+ new_str);
	}
}
