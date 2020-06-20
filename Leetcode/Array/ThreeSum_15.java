package leetcode.Array;

import java.util.*;

public class ThreeSum_15 {
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		int last = 0, mid = 0; 
		for(int i = 0; i < nums.length - 2; i++) {
			last = nums.length -1;
			mid = i+1;
			while(mid < last) {
				if(nums[i]+nums[last]+nums[mid] == 0) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[mid]);
					list.add(nums[last]);
					set.add(list);
					mid++;
					last--;
				}
				else if(nums[i]+nums[last]+nums[mid] > 0){
					last--;
				}
				else {
					mid++;
				}	
			}
		}
		return new ArrayList<>(set);
	}
public static void main(String[] args) {
	ThreeSum_15 sum = new ThreeSum_15();
	int[] nums = {-1, 0,1, 2, -1,4};  
	List<List<Integer>> list = new ArrayList<>();
	list.addAll(sum.threeSum(nums));
	System.out.print("List 1= " +list);
}
}


//Brute Force
//public class ThreeSum_15 {
//  public List<List<Integer>> threeSum(int[] nums) {
//  Set<List<Integer>> set = new HashSet<>();
//  Arrays.sort(nums);
//  for(int i = 0; i < nums.length - 2; i++){
//      for(int j = i+1; j < nums.length - 1; j++){
//          for(int k = j+1; k < nums.length; k++){
//              if(nums[i]+ nums[j] + nums[k] == 0){
//                  List<Integer> list = new ArrayList<>();
//                  list.add(nums[i]);
//                  list.add(nums[j]);
//                  list.add(nums[k]);
//                  set.add(list);
//              }
//          }
//      }
//  }
// 
//          return new ArrayList<>(set);
//}
//public static void main(String[] args) {
//	ThreeSum_15 sum = new ThreeSum_15();
//	int[] nums = {-1, 0,1, 2, -1,4};  
//	List<List<Integer>> list = new ArrayList<>();
//	list.addAll(sum.threeSum(nums));
//		System.out.print(list);
//}
//}