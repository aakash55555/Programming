package leetcode.String;

public class StringToInteger_8 {
//	  public int myAtoi(String str) {
//	       String s = str.trim(); 
//	        if(s.length() == 0){
//	            return 0;
//	        }
//	        char ch = '+';
//	        int index = 0;
//	        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
//	            ch = s.charAt(0);
//	            index++;
//	        }
//	        StringBuilder sb = new StringBuilder();
//	        for(int i = index; i<s.length(); i++){
//	            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
//	                sb.append(s.charAt(i));
//	            }
//	            else{
//	                break;
//	            }
//	        }
//	        double sum =  sb.length() == 0 ? 0 : Double.parseDouble(sb.toString());
//	        if(ch == '-'){
//	            sum = -sum;
//	        }
//	        if(sum > Integer.MAX_VALUE)
//	            return Integer.MAX_VALUE;
//	        if(sum < Integer.MIN_VALUE)
//	            return Integer.MIN_VALUE;
//	        return (int)sum;
//	    }
	  
	  //Very fast
	  public static int myAtoi(String str) {

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);

	            if (!Character.isSpaceChar(c))
	                return convertToInteger(str.substring(i));

	        }

	        return 0;
	    }

	    public static int convertToInteger(String str) {
	        double result = 0;
	        int sign = 1, i = 0;

	        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
	            sign = str.charAt(0) == '+' ? 1 : -1;
	            i++;
	        }

	        while (i < str.length()) {
	            char c = str.charAt(i);
	            
	            if ((c >= '0' && c <= '9')) {

	                result = 10 * result + (c - '0');

	            } else break;

	            i++;

	        }

	        if (sign==-1)
	        result = -result;

	        if (result > Integer.MAX_VALUE)
	            return Integer.MAX_VALUE;
	        else if (result < Integer.MIN_VALUE) 
	            return Integer.MIN_VALUE;
	        


	        return (int) result;
	    }
}
