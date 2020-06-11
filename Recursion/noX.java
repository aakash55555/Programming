/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.
noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/
package Recursion;

import java.util.Scanner;

public class noX {
	public String nox(String str) {
		  if(str.length() == 0){
		    return str;
		  }
		  if(str.charAt(0) == 'x'){
		    return nox(str.substring(1));
		  }
		  return str.charAt(0) + nox(str.substring(1));
		}
	 public static void main(String[] args) {
		 noX x = new noX();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the string = ");
		 String str = scan.next();
		 String new_string = x.nox(str);
		 System.out.print("The new string formed = "+ new_string);
	 }
}
