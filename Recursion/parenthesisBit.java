/*
 * 
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of 
the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
 */
package Recursion;

import java.util.Scanner;

public class parenthesisBit {
	public String parenBit(String str) {
	    if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
	        return str;
	          
	    if(str.charAt(0) == '(')
	        return parenBit(str.substring(0, str.length() - 1));
	                    
	    if(str.charAt(str.length() - 1) == ')')
	        return parenBit(str.substring(1));
	                              
	    return parenBit(str.substring(1, str.length() - 1));
	}
	public static void main(String[] args) {
		parenthesisBit contains = new parenthesisBit();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 String substr = contains.parenBit(str);
		 System.out.print("the substring = "+ substr);
	}

}
