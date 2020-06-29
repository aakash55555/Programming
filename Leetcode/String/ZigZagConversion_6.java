package leetcode.String;

public class ZigZagConversion_6 {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder str = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; i+j < n; j += cycleLen){
                str.append(s.charAt(j+i));
                if(i != 0 && i != numRows -1 && j + cycleLen - i < n){
                    str.append(s.charAt(j + cycleLen - i));
                } 
            }
        }
        return str.toString();
    }
}
