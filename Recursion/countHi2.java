/*
 * 
Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
however do not count "hi" that have an 'x' immedately before them.
countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
 */
package Recursion;

import java.util.Scanner;

public class countHi2 {
	public int count(String str) {
		  if(str.length() <= 1){
			    return 0;
			  }
			  else if(str.length() > 2 && str.substring(0,3).equals("xhi")){
			    return count(str.substring(3));
			  }
			  else if(str.substring(0,2).equals("hi")){
			    return 1 + count(str.substring(2));
			  }

			    return count(str.substring(1));
		}
	public static void main(String[] args) {
		countHi2 total = new countHi2();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 int cont = total.count(str);
		 System.out.print("total number of hi = "+ cont);

	}

}
