package leetcode.bfs;

public class MaxAreaOfIsland_695 {
	 public int maxAreaOfIsland(int[][] grid) {
	        boolean[][] visited = new boolean[grid.length][grid[0].length];
	        int[] row = {1,-1,0,0};
	        int[] column = {0,0,1,-1};
	        int ans = 0;
	        for(int i = 0; i < grid.length; i++){
	            for(int j = 0; j < grid[0].length; j++){
	                if(grid[i][j] == 1 && !visited[i][j]){
	                    int shape = 0;
	                    Stack<int[]> stack = new Stack();
	                    stack.push(new int[]{i,j});
	                    visited[i][j] = true;
	                    while(!stack.empty()){
	                        int[] node = stack.pop();
	                        int r = node[0], c = node[1];
	                        shape++;
	                        for(int k = 0; k <4; k++){
	                            int ro = r + row[k];
	                            int co = c + column[k];
	                            if(ro >= 0 && ro < grid.length && co >= 0 && co <grid[0].length && grid[ro][co] == 1 && !visited[ro][co]){
	                                stack.push(new int[]{ro,co});
	                                visited[ro][co] = true;
	                            }
	                        }
	                    }
	                    ans = Math.max(ans, shape);
	                }
	            }
	        }
	        return ans;
	    }
}
