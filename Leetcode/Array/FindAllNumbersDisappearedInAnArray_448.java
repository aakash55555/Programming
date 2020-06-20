package leetcode.Array;
import java.util.*;

import java.util.List;
//public class FindAllNumbersDisappearedInAnArray_448 {
//	public List<Integer> findDisappearedNumbers(int[] nums) {
//		List<Integer> list = new ArrayList<>();
//		int[] arr = new int[nums.length + 1];
//		for(int i = 0; i< nums.length; i++) {
//			arr[nums[i]] += 1; 
//		}
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				list.add(i);
//			}
//		}
//		return list;
//	}
//	public static void main(String[] args) {
//		FindAllNumbersDisappearedInAnArray_448 missing = new FindAllNumbersDisappearedInAnArray_448();
//		int[] arr = {1,3,4,2,2};
//		List<Integer> list = missing.findDisappearedNumbers(arr);
//		System.out.println("Missing element = "+list);
//	}
//}

public class FindAllNumbersDisappearedInAnArray_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
	    Map<Integer, Integer> numMap = new HashMap<>();
	    List<Integer> numList = new ArrayList<>(); 
	    for(int num: nums){
	        numMap.put(num, numMap.getOrDefault(num,0)+1);
	    }
	    for(int j = 0; j < nums.length; j++){
	        if(!numMap.containsKey(j+1)){
	            numList.add(j+1);
	        }
	    }
	    return numList;
	}
	public static void main(String[] args) {
		FindAllNumbersDisappearedInAnArray_448 missing = new FindAllNumbersDisappearedInAnArray_448();
		int[] arr = {1,3,4,2,2};
		List<Integer> list = missing.findDisappearedNumbers(arr);
		System.out.println("Missing element = "+list);
	}
}