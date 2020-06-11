/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. 
The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
*/

package Recursion;

import java.util.Scanner;

public class bunnyEars2 {
	public int bunnyEars(int num) {
		if(num == 0) {
			return 0;
		}
		else if(num % 2 == 0) {
			return 3 + bunnyEars(num - 1); 
		}
		else if(num % 2 == 1) {
			return 2 + bunnyEars(num - 1); 
		}
		return 0;
	}
	 public static void main(String[] args) {
		 bunnyEars2 bunny = new bunnyEars2();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 int bunnyears = bunny.bunnyEars(num);
		 System.out.print("The number = "+ bunnyears);
	 }

}
