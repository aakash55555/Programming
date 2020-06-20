package leetcode.Array;

public class TransposeMatrix_867 {
	public int[][] transpose(int[][] A) {
		int rows = A[0].length;
		int cols = A.length;
		int[][] B = new int[rows][cols];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				B[j][i] = A[i][j];
			}
		}
		return B;
	}
	public static void main(String[] args) {
		TransposeMatrix_867 transpose = new TransposeMatrix_867();
		int[][] arr = { {1,2,3},{4,5,6},{7,8,9}};
		int[][] output = new int[3][3];
		 output = transpose.transpose(arr);
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}
}
