package leetcode.Array;

//public class SortArrayByParityII_922 {
//    public int[] SortArrayByParityII(int[] A) {
//    	int p1 = 0, p2 = 0;
//    	while(p1 < A.length - 1 && p2 < A.length - 1) {
//    		if( p1 % 2 == 0 || A[p1] % 2 != 0) {
//    			p1++;
//    		}
//    		else if(p2 % 2 == 1 || A[p2] % 2 != 1) {
//    			p2++;
//    		}
//    		else {
//    			A[p1] = A[p1] + A[p2];
//    			A[p2] = A[p1] - A[p2];
//    			A[p1] = A[p1] - A[p2];
//    			p1++;
//    			p2++;
//    		}
//    	}
//    	return A;
//    }

class SortArrayByParityII_922 {
    public int[] SortArrayByParityII(int[] A) {
        int first = 0, last = 1;
        while(first < A.length && last < A.length){
            if(A[first] % 2 == 0 && first < A.length){
                first = first + 2;
            }
            else if(A[last] % 2 == 1 && last < A.length){
                last = last + 2;
            }
            else{
                int temp = A[first];
                A[first] = A[last];
                A[last] = temp;
                first= first + 2;
                last = last + 2;
            }
        }
        return A;
    }
	public static void main(String[] args) {
		SortArrayByParityII_922 sort = new SortArrayByParityII_922();
		int[] arr = {4, 2, 5, 7};
		int[] output = new int[arr.length];
		output = sort.SortArrayByParityII(arr);
		for(int i = 0; i< output.length; i++) {
		System.out.print(output[i]+ " ");
		}
	}
}
