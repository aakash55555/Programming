/*
 * 
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the 
string somewhere, possibly with overlapping. N will be non-negative.
strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
 */
package Recursion;

import java.util.Scanner;

public class stringCopies {
	public boolean strCopies(String str, String sub, int n) {
		  if(n == 0){
		    return true;
		  }
		  else if(str.length() < sub.length()){
		    return false;
		  }
		  if(str.substring(0,sub.length()).equals(sub)){
		    return strCopies(str.substring(1), sub, n-1);
		  }
		  return strCopies(str.substring(1), sub ,n);
		}

	public static void main(String[] args) {
		stringCopies count = new stringCopies();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 System.out.print("Enter the Substring to search = ");
		 String sub = scan.next();
		 boolean exact = count.strCopies(str, sub, 2);
		 System.out.print("The count is = "+ exact);
	}

}
