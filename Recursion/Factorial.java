package Recursion;
import java.util.Scanner; 

public class Factorial {
 public int recursion(int num) {
	 if(num == 1) {
		 return 1;
	 }
	 	return num * recursion(num - 1);
 }
 public static void main(String[] args) {
	 Factorial fact = new Factorial();
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Enter the factorial number = ");
	 int num = scan.nextInt();
	 int factorial = fact.recursion(num);
	 System.out.print("Factorial of the number = "+ factorial);
 }
}
