package leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class MaxPointOnALine_149 {
	  public int maxPoints(int[][] points) {
	        if (points == null || points.length == 0) return 0;
	        int max = 1;
	        Map<Double, Integer> slopes;
	        int samePoints;
	        for (int i = 1; i < points.length; i++) {
	            slopes = new HashMap();
	            samePoints = 0;
	            int currMax = 1;
	            for (int j = 0; j < i; j++) {                    
	                int dx = points[i][0] - points[j][0];
	                int dy = points[i][1] - points[j][1];
	                Double slope;
	                if (dx == 0 && dy == 0) {
	                    samePoints++;
	                    currMax++;
	                    continue;
	                } else if (dx == 0)
	                    slope = Double.MAX_VALUE;
	                else
	                    slope = (double)dy /(double)dx;
	                int hits = slopes.getOrDefault(slope, 1) + 1;
	                slopes.put(slope, hits);
	                currMax = Math.max(currMax, hits + samePoints);
	            }
	            max = Math.max(max, currMax);
	        }
	        return max;
	    }
}
