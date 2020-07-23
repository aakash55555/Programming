package leetcode.Array;

public class ContainerWithMostWater_11 {
	//Brute Force
//    public int maxArea(int[] height) {
//        int max= Integer.MIN_VALUE;
//         for(int i = 0; i< height.length;i++){
//            int first = i;
//            int last = height.length -1;
//             while(first < last){
//            max = Math.max(max, Math.min(height[first], height[last])*(last-first)); 
//            last--;
//            } 
//        }
//        return max;
//    }
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE, first = 0, last = height.length -1;
        while(first < last){
            max = Math.max(max, Math.min(height[first], height[last]) * (last - first));
            if(height[last] > height[first]){
               first++;
        }
            else
                last--;
        }
        return max;
    }
}
