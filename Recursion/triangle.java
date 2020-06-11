/*
 * 
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, 
the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) 
the total number of blocks in such a triangle with the given number of rows.
triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
 */
package Recursion;

import java.util.Scanner;

public class triangle {
	public int Triangle(int rows) {
		  if(rows == 0){
		  return 0;
		}
		return rows + Triangle(rows - 1);
		}
	 public static void main(String[] args) {
		 triangle blocks = new triangle();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 int total_blocks = blocks.Triangle(num);
		 System.out.print("The number of blocks required = "+ total_blocks);
	 }
}
