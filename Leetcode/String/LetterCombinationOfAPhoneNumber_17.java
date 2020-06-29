package leetcode.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfAPhoneNumber_17 {
    Map<String, String> map = new HashMap<String, String>(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    List<String> list = new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0){
        combination("", digits);
            }
        return list;
    }
    public void combination(String curr, String digits){
        if(digits.length() == 0){
            list.add(curr);
        }
        else{
        String digit = digits.substring(0, 1);
        String letters = map.get(digit); 
        for(int i = 0; i < letters.length(); i++){
        String letter = map.get(digit).substring(i, i+1);//String letter = letters.substring(i, i+1); better 
        combination(curr + letter, digits.substring(1));
            }   
        }
    }
}
