/*
 * 
Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
We'll use the convention of considering only the part of the array that begins at the given index. 
In this way, a recursive call can pass index+1 to move down the array. 
The initial call will pass in index as 0.
array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0
 */
package Recursion;
import java.util.Scanner;
public class array11 {
	public int Array11(int[] nums, int index) {
		  if(index == nums.length){
		    return 0;
		  }
		  if(nums[index] == 11){
		    return 1 + Array11(nums, index + 1);
		  }
		  return Array11(nums, index + 1);
		}
	public static void main(String[] args) {
		array11 array = new array11();
		int[] arr = {11, 2 ,3, 4, 5, 11};
		int index = 0;
		int count = array.Array11(arr, index);
		System.out.print("Total number of 11 = "+count);
	}

}
