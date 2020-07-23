package leetcode.Array;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    public int threeSumClosest(int[] nums, int target) {
        int min =Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length - 2 && min != 0;i++){
         int first = i+1; 
         int last = nums.length -1;
         while(first < last){
             int sum = nums[first] + nums[last] + nums[i];
             if(Math.abs(target - sum) < Math.abs(min)){
                 min = target  - sum;
             }
             if(target - sum > 0){
                 first++;
             }
             else if(target - sum <= 0){
                 last--;
             }
         }   
        }
        return target - min;
    }
}
