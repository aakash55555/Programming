package leetcode.Array;

public class AddDigits_258 {
	   // int sum = Integer.MAX_VALUE;
    // public int addDigits(int num) {
    //     while(sum > 9){
    //         sum = 0;
    //    while(num > 0){
    //        sum += (num % 10);
    //        num = num / 10;
    //    } 
    //         num = sum;
    //     }
    //     return sum;
    // }
        public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}
