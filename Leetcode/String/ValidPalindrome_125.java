package leetcode.String;

public class ValidPalindrome_125 {
	public boolean isPalindrome(String s) {
	    if(s.isEmpty())
	        return true;
	        int head = 0;
	        int tail = s.length() - 1;
	        char chead, cbottom;
	        while(head <= tail){
	            chead = s.charAt(head);
	            cbottom = s.charAt(tail);
	            if(!Character.isLetterOrDigit(chead)){
	                head++;
	            }
	            else if(!Character.isLetterOrDigit(cbottom)){
	                tail--;
	            }
	            else{
	                if(Character.toLowerCase(chead) != Character.toLowerCase(cbottom))
	                    return false;
	                head++;
	                tail--;
	            }
	        }
	        return true;
	    }
}
