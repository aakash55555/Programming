package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
public static void main(String[] args) {
	int[] arr = {1,2,3,3,2,3,3,2,3,3,4,5,6,7,8,9};
	AllDuplicates dup = new AllDuplicates();
	dup.duplicates(arr);
	return;
}
private void duplicates(int[] nums) {
    List<Integer> list = new ArrayList<>();
    for(int num : nums){
        if(nums[Math.abs(num) - 1] < 0){
            list.add(Math.abs(num));
        }
            nums[Math.abs(num) - 1] *= -1;
    }
    for(int list_element : list){
    	System.out.print(list_element);
    }	
        return; 
}
}
