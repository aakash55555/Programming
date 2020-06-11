/*
 * 
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by 
that value times 10. We'll use the convention of considering only the part of the array that begins at the 
given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will 
pass in index as 0.
array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false
 */
package Recursion;

import java.util.Scanner;

public class arrayTwoTwenty {
	public boolean array220(int[] nums, int index) {
		  if(index >= nums.length - 1){
		    return false;
		  }
		  if(nums[index + 1] == nums[index] * 10){
		    return true;
		  }
		  return array220(nums, index + 1);
		}
	 public static void main(String[] args) {
		 arrayTwoTwenty tenTimes = new arrayTwoTwenty();
		 Scanner scan = new Scanner(System.in);
		 int[] num = {1, 2, 3, 4, 4, 50, 500, 6};
		 int index = 0;
		 boolean contains = tenTimes.array220(num, index);
		 System.out.print("The number contains atleast one number with 10 times the next number ="+ contains);
	 }
}
