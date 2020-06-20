package leetcode.Array;

import java.util.List;

public class FlippingAnImage_832 {
    public int[][] flipAndInvertImage(int[][] A) {
    	int cols = A.length;
    	int rows = A[0].length;
    	int temp = cols - 1;
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j< cols; j++) {
				if(j < temp) {
				A[i][j] = A[i][temp]+ A[i][j];
				A[i][temp] = A[i][j] - A[i][temp];
				A[i][j] = A[i][j] - A[i][temp];
				}
				temp--;
			}
		}
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j< cols; j++) {
				if(A[i][j] == 0)
					A[i][j] = 1;
				else
					A[i][j] = 0;
			}
		}
		return A;
    }
	public static void main(String[] args) {
		FlippingAnImage_832 image = new FlippingAnImage_832();
		int[][] arr = { {1,1,0},{1,0,1},{0,0,0}};
		int[][] output = new int[3][3];
		 output = image.flipAndInvertImage(arr);
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}
}
