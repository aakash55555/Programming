package leetcode.String;

public class ReverseString_344 {
    public void reverseString(char[] s) {
    if(s.length == 0 || s.length == 1){
        return;
    }    
        int first = 0, last = s.length - 1;
     while(first <= last){
         char ch = s[last];
         s[last] = s[first];
         s[first] = ch;
         first++;
         last--;
     }   
        return;
    }
}
