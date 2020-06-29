package leetcode.String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis_22 {
//    public List<String> generateParenthesis(int n) {
//    List<String> list = new ArrayList<>();
//        backtrack(list, "",0,0, n);
//        return list;
//        }
//    private void backtrack(List<String> list, String str, int opening, int closing, int max){
//        if(str.length() == max * 2){
//            list.add(str);
//            return;
//        }
//        if(opening < max){
//            backtrack(list, str + '(', opening+1, closing, max);
//        }
//        if(closing < opening){
//            backtrack(list, str+ ')', opening, closing +1, max);
//        }
//    }
	//Faster Solution
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n == 0){
            return new ArrayList();
        }
     int start = 0, closing = 0;   
        parenthesis(start, closing,"", n);
        return list;
    }
    private void parenthesis(int start, int closing, String current,int n)     {
    if(start >= n && start == closing){
        list.add(current); 
    }    
        if(start < n){
            parenthesis(start + 1, closing, current +'(', n);
        }
        if(closing < start){
            parenthesis(start, closing + 1, current + ')', n);
        }
        return;
    }
}
