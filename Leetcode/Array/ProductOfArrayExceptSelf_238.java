package leetcode.Array;

public class ProductOfArrayExceptSelf_238 {
	 // With O(N) apace and time complexity
    // public int[] productExceptSelf(int[] nums) {
    //     int[] start = new int[nums.length];
    //     int[] end = new int[nums.length];
    //     int[] answer = new int[nums.length];
    //     start[0] = 1;
    //     for(int i = 1; i < nums.length; i++){
    //         start[i] = nums[i - 1] * start[i-1];
    //     }
    //     end[nums.length -1] = 1;
    //     for(int i = nums.length -2; i >= 0; i--){
    //         end[i] = nums[i + 1] * end[i+1];
    //     }
    //     for(int i = 0; i < answer.length; i++){
    //         answer[i] = start[i] * end[i];
    //     }
    //     return answer;
    // }
    
    //With O(1) space and O(N) time complexity
        public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int curr = 1;
        answer[0] = 1;
        for(int i = 1; i < nums.length; i++){
            answer[i] = nums[i - 1] * answer[i-1];
        }
            curr = 1;        
        for(int i = nums.length - 1; i >= 0; i--){
            answer[i] = answer[i] * curr;
            curr *= nums[i]; 
        }
        return answer;
    }
}
