package leetcode.String;

public class ReverseWordOfAString_151 {
	    public String reverseWords(String s) {
	        s = s.trim();
	        String[] str = s.split("\\s+");
	        int first = 0;
	        int end = str.length - 1;
	        while(first < (0 + str.length)/2){
	            String temp = str[first];
	            str[first] = str[end];
	            str[end] = temp;
	            end--;
	            first++;
	        }
	        StringBuilder combined =  new StringBuilder();
	        for(int i = 0; i < str.length - 1; i++){
	            combined.append(str[i]).append(" ");    
	        }
	        combined.append(str[str.length - 1]);
	        return combined.toString();
	    }
	}
