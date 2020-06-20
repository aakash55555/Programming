package leetcode.Array;

import java.util.List;

//public class MaximumAverageSubarrayI_643 {
//	public double findMaxAverage(int[] nums, int k) {
//		double sum = 0, maxSum = Integer.MIN_VALUE;
//		for(int i = 0; i <k ;i++) {
//			sum = sum + nums[i];
//		}
//		maxSum = Math.max(maxSum, sum);
//		for(int i = k; i < nums.length; i++) {
//			sum = sum + nums[i] - nums[i - k];
//			maxSum = Math.max(sum, maxSum);
//		}
//		return maxSum/k;
//	}
//	public static void main(String[] args) {
//		MaximumAverageSubarrayI_643 average = new MaximumAverageSubarrayI_643();
//		int[] arr = {1,12, -5, -6, 50, 3};
//		int k = 4;
//		double aver = average.findMaxAverage(arr, k);
//		System.out.println("Maximum average of the subarray = "+aver);
//	}
//}

//Brute Force
public class MaximumAverageSubarrayI_643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0; 
        double maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - k + 1; i++){
            sum = 0;
            for(int j = i; j < i+k; j++){
                sum += nums[j]; 
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return (maxSum/k);
    }
	public static void main(String[] args) {
		MaximumAverageSubarrayI_643 average = new MaximumAverageSubarrayI_643();
		int[] arr = {1,12, -5, -6, 50, 3};
		int k = 4;
		double aver = average.findMaxAverage(arr, k);
		System.out.println("Maximum average of the subarray = "+aver);
	}
}
