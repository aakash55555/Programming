/*
 * 
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. 
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the 
rightmost digit (126 / 10 is 12).
count8(8) → 1
count8(818) → 2
count8(8818) → 4
 */
package Recursion;

import java.util.Scanner;

public class count8 {
	public int countEight(int n) {
		  if(n == 0){
		    return 0;
		  }
		  if( n % 100 == 88 && n % 10 == 8){
		  return 2 + countEight(n/10);
		  }
		  else if(n % 100 != 88 && n % 10 == 8){
		    return 1 + countEight(n/10);
		  }
		  return countEight(n/10);
		}
	 public static void main(String[] args) {
		 count8 count = new count8();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 int total_eight = count.countEight(num);
		 System.out.print("The number of 8 = "+ total_eight);
	 }

}
