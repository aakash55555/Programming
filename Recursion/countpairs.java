/*
 * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's 
make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the 
number of pairs in the given string.
countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1
 */
 
package Recursion;

import java.util.Scanner;

public class countpairs {
	public int countPairs(String str) {
		  if(str.length() < 3){
		    return 0;
		  }
		  if(str.charAt(0) == str.charAt(2)){
		    return 1 + countPairs(str.substring(1));
		  }
		  return countPairs(str.substring(1));
		}
	public static void main(String[] args) {
		countpairs total = new countpairs();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 int cont = total.countPairs(str);
		 System.out.print("total pairs of similar characters with different characters in between = "+ cont);

	}

}
