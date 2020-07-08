package leetcode.Array;

public class IslandPerimeter_463 {
	  public int islandPerimeter(int[][] grid) {
	        int rows = grid.length;
	        int columns = grid[0].length;
	        int result = 0;
	        for(int i = 0;i < rows; i++){
	            for(int j = 0; j < columns; j++){
	                if(grid[i][j] == 1){
	                    result += 4;
	                if(i > 0 && grid[i - 1][j] == 1){
	                    result -= 2;
	                }
	                if(j > 0 && grid[i][j - 1] == 1){
	                    result -= 2; 
	                }
	                }       
	            }
	        }
	        return result;
	    }
}
