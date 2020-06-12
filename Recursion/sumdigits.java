/*
 * 
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, 
so powerN(3, 2) is 9 (3 squared).
powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
 */
package Recursion;

import java.util.Scanner;
/**
 * The Class sumdigits.
 */
public class sumdigits {
	
	/**
	 * Sum digits.
	 *
	 * @param n the n
	 * @return the int
	 */
	public int sumDigits(int n) {
		if(n==0){
		    return 0;
		  }
		  
		  return n % 10 + sumDigits(n/10);
		}
	 
 	/**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
 	public static void main(String[] args) {
		 sumdigits count = new sumdigits();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 int sum = count.sumDigits(num);
		 System.out.print("The sum of the digits = "+ sum);
	 }
}
