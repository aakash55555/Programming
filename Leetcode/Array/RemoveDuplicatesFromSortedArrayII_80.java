package leetcode.Array;

public class RemoveDuplicatesFromSortedArrayII_80 {
	public int removeDuplicates(int[] nums) {
		int j = 0, count = 0;
		for(int  i = 1; i < nums.length; i++) {
			if(nums[j] != nums[i]) {
				j++;
				nums[j] = nums[i];
				count = 0;
			}
			else if(nums[j] == nums[i] && count < 1) {
				count = 1;
				j++;
				nums[j] = nums[i];
			}
		}
		return j+1;
	}
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArrayII_80 duplicates = new RemoveDuplicatesFromSortedArrayII_80();
		int[] nums = {1,1,1,2,2,3};
		int len = duplicates.removeDuplicates(nums);{
			System.out.print("Length = "+len);
		}
	}
}
