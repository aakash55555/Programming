package leetcode.Array;
import java.util.*;

//public class TwoSum_1 {
//	public int[] twoSum(int[] nums, int target) {
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i = 0; i < nums.length; i++) {
//			map.put(nums[i], i); 
//		}
//		for(int i = 0; i<nums.length;i++) {
//			int diff = target - nums[i];
//			if(map.containsKey(diff) && map.get(diff) != i) {
//				return new int[] {i, map.get(diff)};
//			}
//		}
//		throw new IllegalArgumentException("Such pair is unavailable");
//	}
//	public static void main(String[] args) {
//		TwoSum_1 sum = new TwoSum_1();
//		int[] nums = {2,7,11,15};
//		int target = 9;
//		int[] indices = new int[2];
//		indices = sum.twoSum(nums, target);
//		System.out.println("Indices[0] = "+indices[0]+ " indices[1] = " + indices[1]);
//	}
//}

//Brute Force Solution
class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+ nums[j] == target)
                    return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("No such pair exists");
    }
	public static void main(String[] args) {
	TwoSum_1 sum = new TwoSum_1();
	int[] nums = {2,7,11,15};
	int target = 9;
	int[] indices = new int[2];
	indices = sum.twoSum(nums, target);
	System.out.println("Indices[0] = "+indices[0]+ " indices[1] = " + indices[1]);
}
}
