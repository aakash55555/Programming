package leetcode.Array;

public class RemoveElements_27 {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        if(nums.length == 0)
            return 0;
        else{
           for(int i = 0; i < nums.length; i++) {
        	   if(nums[i] != val) {
        		   nums[j] = nums[i];
        		   j++;
        	   }
           }
        }
        return j;
    }
    public static void main(String[] args) {
    	RemoveElements_27 rem = new RemoveElements_27();
    	int[] arr = {0,1,2,2,3,0,4,2};
    	int val = 2;
    	int len = rem.removeElement(arr, val);
    	System.out.print("length = "+len);
    }
}
