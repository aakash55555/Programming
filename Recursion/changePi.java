/*
 * 
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */
package Recursion;

import java.util.Scanner;

public class changePi {
	public String changePie(String str) {
		if(str.length() <= 1) {
			return str;
		}
		if(str.substring(0, 2).equals("pi")) {
			return "3.14" + changePie(str.substring(2));
		}
		
		return str.charAt(0) + changePie(str.substring(1));
	}

	public static void main(String[] args) {
		changePi pi = new changePi();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 String new_str = pi.changePie(str);
		 System.out.print("new string = "+ new_str);

	}
}
