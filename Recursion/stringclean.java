/*
 * 
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been 
reduced to a single char. So "yyzzza" yields "yza".
stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
 */
package Recursion;

import java.util.Scanner;

public class stringclean {
	public String stringClean(String str) {
		  if(str.length() <= 1){
		    return str;
		  }
		  if(str.charAt(0) == str.charAt(1)){
		    return stringClean(str.substring(1));
		  }
		  return str.charAt(0) + stringClean(str.substring(1));
		}

	public static void main(String[] args) {
		stringclean total = new stringclean();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 String new_str = total.stringClean(str);
		 System.out.print("String without duplicates = "+ new_str);

	}

}
