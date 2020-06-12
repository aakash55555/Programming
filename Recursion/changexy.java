/*
 * 
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars 
have been changed to 'y' chars.
changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */
package Recursion;

import java.util.Scanner;

public class changexy {
	public String changeXY(String str) {
		  if(str.length() == 0){
		    return str;
		  }
		  if(str.charAt(0) == 'x'){
		    return 'y' + changeXY(str.substring(1));
		  }
		  return str.charAt(0) + changeXY(str.substring(1));
		}
	public static void main(String[] args) {
		changexy total = new changexy();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String = ");
		 String str = scan.next();
		 String new_str = total.changeXY(str);
		 System.out.print("The new string formed = "+ new_str);

	}

}
