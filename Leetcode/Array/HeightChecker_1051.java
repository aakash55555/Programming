package leetcode.Array;
import java.util.Arrays;

public class HeightChecker_1051 {
	    public int heightChecker(int[] heights) {
	        int[] checker = new int[heights.length];
	        System.arraycopy(heights, 0, checker,0, heights.length);
	        Arrays.sort(checker);
	        int count = 0;
	        for(int i = 0; i< heights.length;i++){
	            if(checker[i] != heights[i]){
	                count++;
	            }
	        }
	            return count;
	    }
	   public static void main(String[] args) {
		   HeightChecker_1051 hc = new HeightChecker_1051();
		   int[] heights = {1,1,4,2,1,3};
		   int count = hc.heightChecker(heights);
		   System.out.print(count);
	   }
}
