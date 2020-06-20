package leetcode.Array;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers_628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		return Math.max(nums[0]*nums[1]*nums[nums.length -1], nums[nums.length -3]*nums[nums.length -2]*nums[nums.length -1]);
	}
	public static void main(String[] args) {
		MaximumProductOfThreeNumbers_628 product = new MaximumProductOfThreeNumbers_628();
		int[] arr = {-3,-4,1,2,3};
		int maxProduct = product.maximumProduct(arr);
		System.out.println("Maximum Product of 3 numbers = "+maxProduct);
	}
}
