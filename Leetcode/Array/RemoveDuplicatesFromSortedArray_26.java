package leetcode.Array;

public class RemoveDuplicatesFromSortedArray_26 {
	    public int removeDuplicates(int[] nums) {
	        int i = 0;
	        if(nums.length == 0){
	            return 0;
	        }
	        else{
	            for(int j = 1; j < nums.length; j++){
	                if(nums[j] != nums[i]){
	                    i++;
	                    nums[i] = nums[j];
	                }
	            }
	        }
	        return i+1;            
	    }
	    public static void main(String[] args) {
	    	RemoveDuplicatesFromSortedArray_26 arr = new RemoveDuplicatesFromSortedArray_26();
	    	int[] nums = {0,0,1,1,1,2,2,3,3,4};
	    	int length = arr.removeDuplicates(nums);
	    	System.out.print("length of unique element = " +length);
	    }
}
