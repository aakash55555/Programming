package leetcode.Array;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers_628 {
	//19ms, O(Nlogn) time complexity & O(LogN) space complexity
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		return Math.max(nums[0]*nums[1]*nums[nums.length -1], nums[nums.length -3]*nums[nums.length -2]*nums[nums.length -1]);
	}
	//Faster in 3ms O(N) time complexity and space O(1)
	  public int maximumProduct1(int[] nums) {
	        int min2 = Integer.MAX_VALUE, min1=Integer.MAX_VALUE, max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE,max3 = Integer.MIN_VALUE;
	        for(int num : nums){
	            if(min1 >= num){
	                min2 = min1;
	                min1 = num;
	            }
	            else if(min2 > num){
	                min2 = num;
	            }
	            if(num >= max1){
	                max3 =max2;
	                max2 = max1;
	                max1 = num; 
	            }
	            else if(num >= max2){
	                max3 = max2;
	                max2 = num;
	            }
	            else if(num > max3){
	                max3 = num;
	            }
	        }
	        return Math.max(min1 * min2 * max1 , max1*max2*max3);
	
	public static void main(String[] args) {
		MaximumProductOfThreeNumbers_628 product = new MaximumProductOfThreeNumbers_628();
		int[] arr = {-3,-4,1,2,3};
		int maxProduct = product.maximumProduct(arr);
		System.out.println("Maximum Product of 3 numbers = "+maxProduct);
	}
}
