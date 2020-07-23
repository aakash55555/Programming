package leetcode.Array;

public class TrappingRainWater_42 {
    //Solution with O(1) space complexity and O(N) time complexity--> Another variation of DP
	  public int trap(int[] height) {
	      int left = 0, right = height.length - 1, ans = 0, left_max = Integer.MIN_VALUE, right_max = Integer.MIN_VALUE;
	      while(left < right){
	    	if(height[right] > height[left]){  
	          ans += height[left] > left_max ? 0: left_max - height[left];
	          left_max = Math.max(height[left], left_max);
	    	  left++;
	      }
	      else {
	    	  ans += height[right] > right_max ? 0 : right_max - height[right];
	    	  right_max =Math.max(height[right], right_max);
	    	  	right--;
	      }
	  }
	  return ans;
	}
 
 //Solution with O(N) space complexity and O(N) time complexity--> DP solution

  // public int trap(int[] height) {
//     if(height.length == 0)
//         return 0;
//     int ans = 0;
//     int[] start = new int[height.length];
//     int[] end = new int[height.length];
//     start[0] = height[0];
//     for(int i = 1; i < height.length; i++){
//         start[i] = Math.max(height[i], start[i - 1]); 
//     }
//     end[height.length - 1] = height[height.length - 1];
//     for(int i = height.length -2; i >= 0; i--){
//         end[i] = Math.max(height[i], end[i+1]);
//     }
//     for(int i = 0; i< height.length; i++){
//         ans += Math.min(end[i], start[i]) - height[i];
//     }
//     return ans;
//}
}
