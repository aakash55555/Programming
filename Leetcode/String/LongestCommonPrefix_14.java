package leetcode.String;

public class LongestCommonPrefix_14 {
	//Horizontal Scanning
//	    public String longestCommonPrefix(String[] strs) {
//	        if(strs.length == 0){
//	            return "";
//	        }
//	        int min = Integer.MAX_VALUE;
//	        int j = 0, i = 0;
//	        String str = strs[0];
//	        int length1 = strs[0].length();
//	      for(i = 1; i< strs.length; i++){
//	          int length2 = strs[i].length();
//	          int length = length1 > length2 ?length2 : length1;
//	          for(j = 0; j < length; j++){
//	              if(strs[i].charAt(j) != strs[0].charAt(j)){
//	                  break;
//	              }
//	          }
//	             if(min > j)
//	                 min = j;
//	      }  
//	        return i > 1 ? strs[0].substring(0,min): strs[0];
//	    }
	
//Vertical Scanning
	
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs.equals("") || strs == null){
            return "";
        }
       for(int i = 0; i < strs[0].length();i++){
           char character = strs[0].charAt(i);
       for (int j = 1; j < strs.length; j++){
           if(i == strs[j].length() || strs[j].charAt(i) !=character)
               return strs[0].substring(0,i);
       }
       }
        return strs[0];
    }
	}
