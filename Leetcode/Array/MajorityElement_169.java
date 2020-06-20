package leetcode.Array;

import java.util.*;

//public class MajorityElement_169 {
//    public int majorityElement(int[] nums) {
//    	Arrays.sort(nums);
//    	if(nums[(nums.length - 1)/2] == nums[(nums.length - 1)/4])
//    		return nums[(nums.length - 1)/4];
//    	else if(nums[(nums.length - 1)/2] == nums[(3 * (nums.length - 1))/4])
//    		return nums[3 *(nums.length - 1)/4];
//    	return 0;	
//    }
//	public static void main(String[] args) {
//		MajorityElement_169 majority = new MajorityElement_169();
//		int[] arr = {2,2,1,1,1,2,2};
//		int element = majority.majorityElement(arr);
//		System.out.print("Maximum repeated element = "+element);
//	}
//}

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int num : nums) {
    		map.put(num, map.getOrDefault(num, 0)+1);
    	}
    	for(Map.Entry<Integer, Integer> enter :map.entrySet()) {
    		if(enter.getValue() > (nums.length/2)) {
    			int element = enter.getKey();
    			return element;
    		}
    	}
    	return 0;
    }
	public static void main(String[] args) {
		MajorityElement_169 majority = new MajorityElement_169();
		int[] arr = {2,2,1,1,1,2,2,1,1};
		int element = majority.majorityElement(arr);
		System.out.print("Maximum repeated element = "+element);
	}
}