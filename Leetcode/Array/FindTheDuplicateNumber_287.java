package leetcode.Array;
import java.util.*;

//public class FindTheDuplicateNumber_287 {
//	 public int findDuplicate(int[] nums) {
//	        Set<Integer> set= new HashSet<>();
//	        for(int num : nums){
//	            if(!set.add(num)){
//	                return num;
//	            }
//	        }
//	        return 0;
//	    }
//	public static void main(String[] args) {
//		FindTheDuplicateNumber_287 zeroes = new FindTheDuplicateNumber_287();
//		int[] arr = {1,3,4,2,2};
//		int duplicate = zeroes.findDuplicate(arr);
//		System.out.println("Duplicate element = "+duplicate);
//	}
//}

public class FindTheDuplicateNumber_287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1])
            return nums[i];
        }
        return 0;
    }
    //best solution satisfying all the constraint O(N) time complexity, space complexity O(1) & not modifying the array
    public int findDuplicate1(int[] nums) {
    for(int i = 0; i< nums.length; i++){
        if(nums[Math.abs(nums[i])] >= 0){
        nums[Math.abs(nums[i])] *= -1;    
        }
        else{
            return Math.abs(nums[i]);
        }
    } 
    return 0;   
    }
public static void main(String[] args) {
	FindTheDuplicateNumber_287 zeroes = new FindTheDuplicateNumber_287();
	int[] arr = {1,3,4,2,2};
	int duplicate = zeroes.findDuplicate(arr);
	System.out.println("Duplicate element = "+duplicate);
}
}
