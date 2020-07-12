package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray_442 {
    public List<Integer> findDuplicates(int[] nums) {
    //Using O(n) space
    
    // List<Integer> list = new ArrayList<>();
    // Set<Integer> set = new HashSet<>();
    // for(int num : nums){
    //     if(!set.add(num)){
    //         list.add(num);
    //     }
    //     else{
    //         set.add(num);
    //     }
    // }
    // return list;
    
	
    // using sort(no extra space)
    
    // List<Integer> list = new ArrayList<>();
    // Arrays.sort(nums);
    // for(int i = 0; i< nums.length - 1; i++){
    //     if(nums[i] == nums[i+1]){
    //         list.add(nums[i]);
    //     }
    // }
    // return list;
    
    //Space = O(1) and time complexity O(N)
    List<Integer> list = new ArrayList<>();
    for(int num : nums){
        if(nums[Math.abs(num) - 1] < 0){
            list.add(Math.abs(num));
        }
            nums[Math.abs(num) - 1] *= -1;
        }
        return list;       
    }
}
