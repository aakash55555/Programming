package leetcode.bfs;

import java.util.ArrayDeque;
import java.util.Queue;

class obj{
    int row, column, layer;
    public obj(int row, int column, int layer){
        this.row = row;
        this.column = column;
        this.layer = layer;
    }
}
class Solution {
    public int RottingOranges_994(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<obj> queue = new ArrayDeque<>();
     for(int i = 0; i < r; i++){
         for(int j = 0; j < c; j++){
             if(grid[i][j] == 2){
                 queue.add(new obj(i,j,0));
             }
         }
     }
        int[] x = {0, 0, -1, 1};
        int[] y = {-1, 1, 0 ,0};
        int result = 0;
     while(!queue.isEmpty()){
         obj q = queue.poll();
         result = Math.max(q.layer, result); 
         for(int i = 0; i < x.length;i++){
            int ro = q.row + x[i];
            int col = q.column + y[i];
            if(inside(grid, ro, col) && grid[ro][col] == 1){
                queue.add(new obj(ro,col,q.layer+1));
                grid[ro][col] = 2;
            } 
         }
     }
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return result;
    }
    public boolean inside(int[][] grid, int row, int column){
        if(row < 0 || row >= grid.length || column <0 || column >= grid[0].length){
            return false;
        }
        return true;
    }
}
