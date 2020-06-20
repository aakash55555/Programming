package leetcode.Array;

//public class FibonacciSeries_509 {
//    public int fib(int N) {
//    	int a = 0, b = 1, sum = 0;
//    	for(int i = 0; i < N; i++) {
//    		sum = a + b;
//    		a = b;
//    		b = sum;
//    	}
//    	return a;
//    }
//	public static void main(String[] args) {
//		FibonacciSeries_509 fibo = new FibonacciSeries_509();
//		int n = 30;
//		int output = fibo.fib(n);
//		System.out.print(output);
//	}
//
//}

//Alternate but top one is fast
public class FibonacciSeries_509 {
    public int fib(int N) {
        double root = Math.sqrt(5);
     double goldenRatio = (1 + root)/2;
     return (int)(Math.round(Math.pow(goldenRatio, N) / root));   
    }
	public static void main(String[] args) {
		FibonacciSeries_509 fibo = new FibonacciSeries_509();
		int n = 30;
		int output = fibo.fib(n);
		System.out.print(output);
	}

}