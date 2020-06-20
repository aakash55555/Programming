package leetcode.Array;

public class MissingNumber_268 {
	 public int missingNumber(int[] nums) {
		 int sum = 0;
		 for(int i = 0; i< nums.length;i++) {
			 sum =sum + nums[i];
		 }
		 return (nums.length * (nums.length + 1)) /2 - sum; 
		 
	 }
	public static void main(String[] args) {
		MissingNumber_268 missing = new MissingNumber_268();
		int[] arr = {9,6,4,2,3,5,7,0,1};
		int val = missing.missingNumber(arr);
		System.out.print(val);
	}
}
