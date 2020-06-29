package leetcode.String;

import java.util.Stack;

public class ValidParenthesis_20 {
//	    public boolean isValid(String s) {
//	        if(s.length() == 0){
//	            return true;
//	        }
//	        Stack<Character> stack = new Stack<>();
//	        for(char ch : s.toCharArray()){
//	            if(ch == '(' || ch == '[' || ch == '{'){
//	                stack.push(ch);
//	            }
//	            else if((ch == ')' || ch == ']' || ch == '}') && stack.isEmpty()){
//	                return false;
//	            }
//	            else if(ch == ')' && stack.peek() == '('){
//	                stack.pop();
//	            }
//	            else if(ch == ']' && stack.peek() == '['){
//	                stack.pop();
//	            }
//	            else if(ch == '}' && stack.peek() == '{'){
//	                stack.pop();
//	            }
//	            else{
//	                stack.push(ch);
//	            }
//	        }
//	        return stack.isEmpty();
//	    }
    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
}
