package leetcode.Array;

public class UniquePaths_62 {
    public int uniquePaths(int m, int n) {
    	//Better solution
        int[][] arr = new int[m][n];
         for(int i = 0; i < m; i++){
             arr[i][0] = 1;
         }
         for(int i = 0; i < n; i++){
             arr[0][i] = 1;
         }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                arr[j][i] = arr[j-1][i] + arr[j][i-1];
            }
        } 
         return arr[m-1][n-1];
     }
    //Alternate solution
//    public int uniquePaths(int m, int n) {
//        int[][] arr = new int[m][n];
//         for(int[] ar : arr){
//             Arrays.fill(ar, 1);
//         }
//        for(int i = 1; i < n; i++){
//            for(int j = 1; j < m; j++){
//                arr[j][i] = arr[j-1][i] + arr[j][i-1];
//            }
//        } 
//         return arr[m-1][n-1];
//     }
}
