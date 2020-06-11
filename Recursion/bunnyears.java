/*
 * 
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
 */
package Recursion;

import java.util.Scanner;

public class bunnyears {
	public int bunnyEars(int bunnies) {
		  if(bunnies == 0){
		    return 0;
		  }
		  return 2 + bunnyEars(bunnies - 1);
		}
	 public static void main(String[] args) {
		 bunnyears bunny = new bunnyears();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 int bunnyears = bunny.bunnyEars(num);
		 System.out.print("The number = "+ bunnyears);
	 }
}
