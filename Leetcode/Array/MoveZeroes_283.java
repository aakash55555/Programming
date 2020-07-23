package leetcode.Array;

public class MoveZeroes_283 {
	// Solution 1
//	public void moveZeroes(int[] nums) {
//		int p1 = 0, p2 = 0;
//		for(int i = 0; i< nums.length; i++) {
//			if(nums[p1] != 0) {
//				p1++;
//			}
//			else if(nums[p2] == 0) {
//				p2++;
//			}
//			else if(p1 < p2) {
//				nums[p1] = nums[p1] + nums[p2];
//				nums[p2] = nums[p1] - nums[p2];
//				nums[p1] = nums[p1] - nums[p2];
//				p1++;
//				p2++;
//			}
//			else {
//				p1++;
//			}
//		}
//		for(int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
//	}
	// better solution faster
	public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return;
	}
	}
	public static void main(String[] args) {
		MoveZeroes_283 zeroes = new MoveZeroes_283();
		int[] arr = {0,1,0,3,12};
		zeroes.moveZeroes(arr);
	}
}
