package leetcode.Array;

public class SortArrayByParityII_922 {
    public int[] sortArrayByParityII(int[] A) {
    	int p1 = 0, p2 = 0;
    	while(p1 < A.length - 1 && p2 < A.length - 1) {
    		if( p1 % 2 == 0 || A[p1] % 2 != 0) {
    			p1++;
    		}
    		else if(p2 % 2 == 1 || A[p2] % 2 != 1) {
    			p2++;
    		}
    		else {
    			A[p1] = A[p1] + A[p2];
    			A[p2] = A[p1] - A[p2];
    			A[p1] = A[p1] - A[p2];
    			p1++;
    			p2++;
    		}
    	}
    	return A;
    }
	public static void main(String[] args) {
		SortArrayByParityII_922 sort = new SortArrayByParityII_922();
		int[] arr = {4, 2, 5, 7};
		int[] output = new int[arr.length];
		output = sort.sortArrayByParityII(arr);
		for(int i = 0; i< output.length; i++) {
		System.out.print(output[i]+ " ");
		}
	}
}
