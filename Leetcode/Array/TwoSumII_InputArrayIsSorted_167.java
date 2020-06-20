package leetcode.Array;

public class TwoSumII_InputArrayIsSorted_167 {
	 public int[] twoSum(int[] numbers, int target) {
		 int  p1 = 0, p2 = numbers.length - 1;
		 while(p1 < p2) {
			 if(numbers[p1] + numbers[p2] == target) {
				 return new int[]{p1 + 1, p2 + 1};
			 }
			 else if(numbers[p1] + numbers[p2] > target) {
				 p2--;
			 }
			 else {
				 p1++;
			 }
		 }
		 throw new IllegalArgumentException("no such pair exists");
	 }
	public static void main(String[] args) {
		TwoSumII_InputArrayIsSorted_167 sum = new TwoSumII_InputArrayIsSorted_167();
		int arr[] = {1,2,7,11,15};
		int target = 9;
		int[] out = new int[2];
		out = sum.twoSum(arr, target);
		for(int i = 0; i <2; i++) {
		System.out.print(out[i] + " ");
		}
	}

}
