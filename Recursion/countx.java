/*
 * 
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
 * 
 */
package Recursion;

import java.util.Scanner;

public class countx {
	public int countX(String str) {
		  //int count = 0;
		  if(str.length() == 0 ){
		  //  return count;
			  return 0;
		  }
		  if(str.charAt(0) == 'x'){
		  //  count++;
		  //return count + countX(str.substring(1));
		  return 1 + countX(str.substring(1));
		  }
		  return countX(str.substring(1));
		}

	public static void main(String[] args) {
		countx x = new countx();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 int count = x.countX(str);
		 System.out.print("x is repeated "+ count+ " times");

	}

}
