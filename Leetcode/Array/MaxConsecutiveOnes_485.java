package leetcode.Array;


public class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int count = 0, max = 0;
    		for(int i = 0; i< nums.length; i++) {
    			if(nums[i] == 1) {
    				count++;
    			}
    			else {
    				if(count > max) {
    					max = count;
    				}
    				count = 0;
    			}
    		}
    		if(count > 0) {
    			if(count > max) {
    				max = count;
    				return max;
    			}
    		}
    		return max;
    }
	public static void main(String[] args) {
		MaxConsecutiveOnes_485 consecutive = new MaxConsecutiveOnes_485();
		int[] arr = {1,1,0,1,1,1};
		int list = consecutive.findMaxConsecutiveOnes(arr);
		System.out.println("Consecutive 1's = "+list);
	}
}
