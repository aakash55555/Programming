package leetcode.String;

public class MinimumWindowSubstring_76 {
    public String minWindow(String s, String t) {
        if(s == null || t == null){
            return "";
        }  
          String str = new String();
          int[] arr = new int[128];
          int left = 0, count = 0, min_length = Integer.MAX_VALUE;
          for(char ch: t.toCharArray()){
              arr[ch] = arr[ch] + 1;
          }
          for(int right = 0; right < s.length(); right++){
              if(--arr[s.charAt(right)] >= 0){
                  count++;
              }
              while(count == t.length()){
                  if(min_length > right - left + 1){
                      min_length = right - left +1;
                      str = s.substring(left, right + 1);
                  }
                  if(++arr[s.charAt(left)] > 0){
                      count--;
                  }
                  left++;
              }

          }
          return str;
      }
}
