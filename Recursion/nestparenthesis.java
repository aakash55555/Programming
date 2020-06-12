/*
 * 
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". 
Suggestion: check the first and last chars, and then recur on what's inside them.
nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
 */
package Recursion;

import java.util.Scanner;

public class nestparenthesis {
	public boolean nestParen(String str) {
		  if(str.length() == 0){
		    return true;
		  }
		    if(str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')'){
		    return nestParen(str.substring(1, str.length() - 1));
		  }
		  return false;
		}
	public static void main(String[] args) {
		nestparenthesis total = new nestparenthesis();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 boolean contains = total.nestParen(str);
		 System.out.print("the string contains only pairs of parenthesis = "+ contains);

	}

}
