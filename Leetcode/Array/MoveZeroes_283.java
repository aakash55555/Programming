package leetcode.Array;

public class MoveZeroes_283 {
	public void moveZeroes(int[] nums) {
		int p1 = 0, p2 = 0;
		for(int i = 0; i< nums.length; i++) {
			if(nums[p1] != 0) {
				p1++;
			}
			else if(nums[p2] == 0) {
				p2++;
			}
			else if(p1 < p2) {
				nums[p1] = nums[p1] + nums[p2];
				nums[p2] = nums[p1] - nums[p2];
				nums[p1] = nums[p1] - nums[p2];
				p1++;
				p2++;
			}
			else {
				p1++;
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	public static void main(String[] args) {
		MoveZeroes_283 zeroes = new MoveZeroes_283();
		int[] arr = {0,1,0,3,12};
		zeroes.moveZeroes(arr);
	}
}
