package leetcode.Array;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray_581 {
    public int findUnsortedSubarray(int[] nums) {
    	int[] arr = new int[nums.length];
    	System.arraycopy(nums, 0, arr, 0, nums.length);
    	Arrays.sort(arr);
    	int i =0, j = 0;
    	for(i = 0; i< nums.length; i++) {
    		if(nums[i] != arr[i]) {
    			break;	
    		}
    	}
    	for(j = nums.length - 1; j >= 0; j--) {
    		if(nums[j] != arr[j]) {
    			break;	
    		}
    	}
    	if(j >i) {
    		return j-i+1;
    	}
    	else 
    		return 0;
    }
	   public static void main(String[] args) {
		   ShortestUnsortedContinuousSubarray_581 shortest = new ShortestUnsortedContinuousSubarray_581();
		   int[] subarray = {2, 6, 4, 8, 10, 9, 15};
		   int count = shortest.findUnsortedSubarray(subarray);
		   System.out.print(count);
	   }
}
