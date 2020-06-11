/*
 * 
Given a string and a non-empty substring sub, 
compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
 */
package Recursion;

import java.util.Scanner;

public class strCount {
	public int strcount(String str, String sub) {
		  if(str.length() < sub.length()){
		    return 0;
		  }
		  if(str.substring(0, sub.length()).equals(sub)){
		    return 1 + strcount(str.substring(sub.length()), sub);
		  }
		  return strcount(str.substring(1), sub);
		}
	public static void main(String[] args) {
		strCount count = new strCount();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 System.out.print("Enter the matching String = ");
		 String sub = scan.next();
		 int cont = count.strcount(str, sub);
		 System.out.print("count = "+ cont);

	}
}
