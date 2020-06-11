/*
 * 
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
(no loops). 
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
count7(717) → 2
count7(7) → 1
count7(123) → 0
 */
package Recursion;

import java.util.Scanner;

public class returnOccurencesOf7 {
	public int occur(int num) {
		int count = 0;
		if(num == 0) {
			return count; 
		}
		if((num % 10) == 7) {
			count++;
		}
		return count + occur(num/10);
	}
	 public static void main(String[] args) {
		 returnOccurencesOf7 occurences = new returnOccurencesOf7();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 int sevenoccur = occurences.occur(num);
		 System.out.print("The number = "+ sevenoccur);
	 }
}
