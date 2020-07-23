package leetcode.Array;

//public class SortArrayByParity_905 {
//    public int[] sortArrayByParity(int[] A) {
//    	int p1 = 0, p2 = A.length -1;
//    	while(p1 < p2) {
//    		if(A[p1] % 2 == 0) {
//    			p1++;
//    		}
//    		else if(A[p2] % 2 == 1) {
//    			p2--;
//    		}
//    		else{
//    			A[p1] = A[p1] + A[p2];
//    			A[p2] = A[p1] - A[p2];
//    			A[p1] = A[p1] - A[p2];
//    			p1++;
//    			p2--;
//    		}
//    	}
//    	return A;
//    	
//    }
//	public static void main(String[] args) {
//		SortArrayByParity_905 sort = new SortArrayByParity_905();
//		int[] arr = {3, 1, 2, 4};
//		int[] output = new int[arr.length];
//		output = sort.sortArrayByParity(arr);
//		for(int i = 0; i< output.length; i++) {
//		System.out.print(output[i]+ " ");
//		}
//	}
//}

public class SortArrayByParity_905 {
	//Better solution 
	public int[] sortArrayByParity1(int[] A) {
	    int j = 0;
	    for(int i = 0; i< A.length; i++){
	        if(A[i] % 2 == 0){
	            int temp = A[j];
	            A[j] = A[i];
	            A[i] = temp;
	            j++;
	        }
	    }
	    return A;
	}
	
    public int[] sortArrayByParity(int[] A) {
        int p1 = 0, p2 = 0;
        while(p1 < A.length && p2 < A.length){
            if(A[p1] % 2 == 0){
                p1++;
            }
            else if(A[p2] % 2 == 1){
                p2++;
            }
            else if(p1 < p2){
                A[p1] = A[p1] + A[p2];
                A[p2] = A[p1] - A[p2];
                A[p1] = A[p1] - A[p2];
            }
            else if(p1 > p2){
                p2++;
            }
        }
        return A;
    }
	public static void main(String[] args) {
		SortArrayByParity_905 sort = new SortArrayByParity_905();
		int[] arr = {3, 1, 2, 4};
		int[] output = new int[arr.length];
		output = sort.sortArrayByParity(arr);
		for(int i = 0; i< output.length; i++) {
		System.out.print(output[i]+ " ");
		}
	}
}