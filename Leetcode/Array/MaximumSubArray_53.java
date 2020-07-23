package leetcode.Array;
//Lessons modifying the existing array

public class MaximumSubArray_53 {
	//Brute force
    public int maxSubArray1(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int sum, max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            sum = nums[i];
            max = Math.max(sum, max);//I Forgot this
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j]; 
                max = Math.max(sum, max); 
            }
        }
        max = Math.max(max, nums[nums.length -1]);//Also forgot this
        return max;
    } 
	public int maxSubArray(int[] nums) {
		 if(nums.length == 0) {
			 return 0;
		 }
		 int max = Integer.MIN_VALUE;
		 for(int i = 1; i < nums.length; i++) {
			 if(nums[i-1] > 0) {
				 nums[i] = nums[i] + nums[i-1];
				 max = Math.max(max, nums[i]);
			 }
		 }
		 return max;
	 }
public static void main(String[] args) {
	MaximumSubArray_53 sub = new MaximumSubArray_53();
	int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
	int sum = sub.maxSubArray(arr);
	System.out.print("sum of maximum subarray = "+sum);
}
}
