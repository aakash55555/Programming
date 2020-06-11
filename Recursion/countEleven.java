/*
 * 
Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings 
should not overlap.
count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
 */
package Recursion;

import java.util.Scanner;

public class countEleven {
	public int count11(String str) {
		  if(str.length() <= 1){
		    return 0;
		  }
		  if(str.substring(0,2).equals("11")){
		    return 1 + count11(str.substring(2));
		  }
		  return count11(str.substring(1));
		}

	public static void main(String[] args) {
		countEleven count = new countEleven();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 int cont = count.count11(str);
		 System.out.print("The total number of 11= "+ cont);
	}

}
