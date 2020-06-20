package leetcode.Array;

import java.util.Arrays;

public class SquaresOfASortedArray_977 {
    public int[] sortedSquares(int[] A) {
    	for(int i = 0; i < A.length; i++) {
    		A[i] = A[i] * A[i];
    	}
    	Arrays.sort(A);
    	return A;
    }
	public static void main(String[] args) {
		SquaresOfASortedArray_977 squares = new SquaresOfASortedArray_977();
		int[] arr = {-1,-2,-3,1,2,3};
		int[] output = new int[arr.length]; 
		output = squares.sortedSquares(arr);
		for(int i = 0; i < output.length; i++) {
		System.out.print(output[i] + " ");
		}
	}
}
