package leetcode.String;

public class IntegerToEnglishWords_273 {
	 String[] THOUSANDS = {"","Thousand","Million","Billion"};
     String[] ONES = {"", "One", "Two", "Three", "Four", "Five","Six", "Seven", "Eight",                 "Nine", "Ten", "Eleven", "Twelve", "Thirteen",                                                     "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
     String[] TENS = {"","","Twenty", "Thirty","Forty", "Fifty", "Sixty", "Seventy",                     "Eighty","Ninety"};
 public String numberToWords(int num) {
         if(num == 0){
             return "Zero";
         }
     int index = 0;
     StringBuilder sb = new StringBuilder();
         while(num > 0){
             if(num % 1000 != 0){
         StringBuilder temp = new StringBuilder();    
         helper(temp, num % 1000);
         sb.insert(0, temp.append(THOUSANDS[index]).append(" "));    
         }
             num /= 1000;
             index++;
     
 }
     return sb.toString().trim();
 }
 private void helper(StringBuilder temp, int num){
     if(num == 0){
         return;
     }
     else if(num < 20){
         temp.append(ONES[num]).append(" ");
     }
     else if(num < 100){
         temp.append(TENS[num/10]).append(" ");
         helper(temp, num%10);
     }
     else{
         temp.append(ONES[num / 100]).append(" Hundred").append(" ");
         helper(temp, num %100);
     }
 }
}
