package leetcode.Array;

import java.util.Arrays;

public class ArrayPartition1_561 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i = i+2){
            sum += nums[i];
        }
        return sum;
    }
}
