/*
 * 
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
 */
package Recursion;

import java.util.Scanner;

public class countHi {
	public int counthi(String str) {
		  if(str.length() < 2){
		    return 0;
		  }
		  if(str.substring(0,2).equals("hi")){
		    return 1 + counthi(str.substring(2));
		  }
		  return counthi(str.substring(1));
		}
	public static void main(String[] args) {
		countHi total = new countHi();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 int cont = total.counthi(str);
		 System.out.print("total number of hi = "+ cont);

	}
}
