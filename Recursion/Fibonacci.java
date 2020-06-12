/*
 * 
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. 
The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the 
sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start 
of the sequence.
fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
 */
package Recursion;

import java.util.Scanner;

public class Fibonacci {
	public int fibonacci(int n) {
		  if(n == 0){
		    return 0;
		  }
		  else if(n == 1){
		    return 1;
		  }
		  
		  return fibonacci(n-2) + fibonacci(n-1);
		}
	 public static void main(String[] args) {
		 Fibonacci count = new Fibonacci();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number = ");
		 int num = scan.nextInt();
		 int fibo = count.fibonacci(num);
		 System.out.print("Fibonacci number= "+ fibo);
	 }
}
