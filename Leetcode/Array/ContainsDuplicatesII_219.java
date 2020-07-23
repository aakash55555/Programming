package leetcode.Array;
import java.util.*;
//public class ContainsDuplicatesII_219 {
//	 public boolean containsNearbyDuplicate(int[] nums, int k) {
//		 if(nums.length == 0) {
//			 return false;
//		 }
//		 if(k >= nums.length) {
//			 k = nums.length - 1;
//		 }
//		 for(int i = 0; i < nums.length -k; i++) {
//			 for(int j = i+1; j < i+1+k; i++) {
//				 if(nums[i] == nums[j]) {
//					 return true;
//				 }
//			 }
//		 }
//		 for(int i = nums.length -k; i < nums.length-1; i++) {
//			 if(nums[i] == nums[i+1]) {
//				 return true;
//			 }
//		 }
//		 return false;
//	 }
//	public static void main(String[] args) {
//		ContainsDuplicatesII_219 zeroes = new ContainsDuplicatesII_219();
//		int[] arr = {1,2,3,1};
//		int k = 1;
//		boolean duplicate = zeroes.containsNearbyDuplicate(arr, k);
//		System.out.println("Duplicate element = "+ duplicate);
//	}
//}


public class ContainsDuplicatesII_219 {
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
		 Set<Integer> set = new HashSet<>();
		 for(int i = 0; i< nums.length; i++) {
			 if(i > k) {
			 set.remove(nums[i - k -1]);
			 }
			 if(!set.add(nums[i])) {
				 return true;
			 }
		 }
		 return false;
	 }
	 public boolean containsNearbyDuplicate1(int[] nums, int k) {
	       Set<Integer> set = new HashSet<>();
	        for(int i = 0; i < nums.length; i++) {
	        if(i > k){
	            set.remove(nums[i-k-1]);
	        }
	        if(set.contains(nums[i])){
	            return true;
	        }
	            set.add(nums[i]);
	        }
	        return false;
	    }	 
	public static void main(String[] args) {
		ContainsDuplicatesII_219 zeroes = new ContainsDuplicatesII_219();
		int[] arr = {1,2,3,1};
		int k = 3;
		boolean duplicate = zeroes.containsNearbyDuplicate(arr, k);
		System.out.println("Duplicate element = "+ duplicate);
	}
}
