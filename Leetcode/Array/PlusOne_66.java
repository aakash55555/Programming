package leetcode.Array;

public class PlusOne_66 {
	 public int[] plusOne(int[] digits) {
		 int carry = 0;
		 if(digits[digits.length -1] + 1 > 9) {
			 carry = (digits[digits.length -1] +1) / 10;
		 digits[digits.length -1] = (digits[digits.length -1] +1) % 10;
		 }
		 else{
		 digits[digits.length -1] = digits[digits.length -1] +1;
		 carry = 0;
		 }
		 for(int i = digits.length -2 ; i >= 0; i--) {
			 if(digits[i] + carry > 9) {
				 digits[i] = (digits[i] +carry) % 10;
				 carry = 1;
			 }
			 else {
					 digits[i] = digits[i] +carry;
					 carry = 0;
			 }
		 }
		 if(carry == 1) {
			 int[] output = new int[digits.length + 1];
			 output[0] = 1;
			 for(int i = 1; i < output.length;i++) {
				 output[i] = digits[i-1];
			 }
			 return output;
		 }
		 else {
			 return digits;
		 }
	 }
	 public static void main(String[] args) {
		 PlusOne_66 plus = new PlusOne_66();
		 int arr[] = {9,9,9};
		 int[] output = new int[arr.length+1];
		 output = plus.plusOne(arr);
		 for(int i = 0; i < output.length; i++) {
			 System.out.print(output[i]);
		 }
	 }
}

//Always remember the order of carry(/10) and digits(%10)
//making changes only in digits no new array is taken initially