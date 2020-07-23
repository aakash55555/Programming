package leetcode.Array;

public class RotateArray_189 {
	  public void rotate(int[] nums, int k) {
		if(nums.length == 1) {
			return;
		}
		if(k > nums.length) {
			k = k % nums.length;
		}
		if(k == 0) {
			return;
		}
		else {
			int[] temp = new int[k];
			int last = nums.length - k; 
			for(int i = 0; i < k; i++) {
				temp[i] = nums[last++];
			}
			last = nums.length - 1;
			for(int i = nums.length - k - 1; i >= 0; i--) {
				nums[last--] = nums[i];
			}
			for(int i = 0; i < k; i++) {
				nums[i] = temp[i];
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	  }
	public static void main(String[] args) {
		RotateArray_189 rotat = new RotateArray_189();
		int[] arr = {-1, -100, 3, 99};
		int k = 2;
		rotat.rotate(arr, k);
	}
	//good solution O(N)and O(1) space
//	  public void rotate(int[] nums, int k) {
//		    k %= nums.length;
//		    reverse(nums, 0, nums.length - 1);
//		    reverse(nums, 0, k - 1);
//		    reverse(nums, k, nums.length - 1);
//		  }
//	
//	 public void reverse(int[] nums, int start, int end) {
//		    while (start < end) {
//		      int temp = nums[start];
//		      nums[start] = nums[end];
//		      nums[end] = temp;
//		      start++;
//		      end--;
//		    }
//		  }
}
