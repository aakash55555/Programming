package leetcode.String;

public class FirstUniqueCharacterInAString_387 {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
          int i = 0;
          for(char ch : s.toCharArray()){
              arr[ch - 'a'] += 1;
          }
          for(i = 0; i < s.length(); i++){
              if(arr[s.charAt(i) - 'a'] == 1){
                  return i;
              }
          }
          return -1;
      }
}
