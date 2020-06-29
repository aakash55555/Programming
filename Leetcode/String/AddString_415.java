package leetcode.String;

public class AddString_415 {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int carry = 0, sum = 0;
        int add1 = 0, add2 = 0;
        int length1 = num1.length() - 1;
        int length2 = num2.length() - 1;
        while(length1 >= 0 || length2 >= 0){
            add1 = (length1 >= 0)? num1.charAt(length1) - '0' : 0;
            add2 = (length2 >= 0)? num2.charAt(length2) - '0': 0;
            sum = (add1 + add2 + carry) % 10;
            carry = sum / 10;
            str.append(sum);
            length1--;
            length2--;
        }
        if(carry != 0){
            str.append(carry);
        }
        return str.reverse().toString();
    }
}
