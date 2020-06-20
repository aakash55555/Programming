package leetcode.Array;

public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        else{
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;            
            }
        }
        }
        return nums.length;
    }
    public static void main(String[] args) {
    	SearchInsertPosition_35 search = new SearchInsertPosition_35();
    	int[] arr = {1,3,5,6};
    	int val = 7;
    	int position = search.searchInsert(arr, val);
    	System.out.print("Position = "+position);
    }
}
