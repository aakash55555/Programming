package leetcode.bfs;

public class MineSweeper_529 {
	   public char[][] updateBoard(char[][] board, int[] click) {
	        int[][] dir = {{1,0},{-1,0},{-1,-1},{-1,1},{1,1},{1,-1},{0,1},{0,-1}};
	        if(board[click[0]][click[1]] == 'M'){
	            board[click[0]][click[1]] = 'X';
	        }
	        else{
	            updateBoardUtil(board, click[0], click[1], dir);
	        }
	        return board;
	    }
	    public void updateBoardUtil(char[][] board, int x, int y, int[][] dir){
	        check(board, x,y,dir);
	        if(board[x][y] != 'B'){
	            return; 
	        }
	        for(int[] current : dir){
	            int row = current[0] + x;
	            int column = current[1] + y;
	            if(row >= 0 && column >= 0 && row < board.length && column < board[0].length && board[row][column] == 'E'){
	                updateBoardUtil(board,row,column,dir);
	            }
	            
	        }
	    }
	    public void check(char[][] board,int x, int y, int[][] dir){
	        int result = 0;
	        for(int[] current: dir){
	            int row = current[0] + x;
	            int col = current[1] + y;
	        if(row >= 0 && col >= 0 && row < board.length && col < board[0].length && board[row][col] == 'M'){
	            result++;
	            }
	                    board[x][y] = result == 0? 'B':(char)('0'+ result);

	        }
	             }
}
