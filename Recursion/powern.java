/*
 * 
Given base and n that are both 1 or more, compute recursively (no loops) 
the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
 */
package Recursion;

import java.util.Scanner;

public class powern {
	public int powerN(int base, int n) {
		  if(n==0){
		    return 1;
		  }
		  return base * powerN(base, n-1);
		}

 	public static void main(String[] args) {
 		powern count = new powern();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 System.out.print("Enter the power to be calculated = ");
		 int pow = scan.nextInt();
		 int power = count.powerN(num, pow);
		 System.out.print("The sum of the digits = "+ power);
	 }

}
