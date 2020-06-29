package leetcode.String;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_929 {
	//Taking 7ms to run
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
    for(String str: emails){
        int index = str.indexOf('@');
        String start = str.substring(0, index);
        String end = str.substring(index);
        StringBuilder sb = new StringBuilder();
        for(char ch : start.toCharArray()){
            if(ch == '.'){
                continue;
            }
            else if(ch == '+')
                break;
            sb.append(ch);
        }
        sb.append(end);
        set.add(sb.toString());
    }    
        return set.size();
    }
}   
    //Taking 21ms
//    public int numUniqueEmails(String[] emails) {
//        Set<String> set = new HashSet<>();
//    for(String str: emails){
//        int index = str.indexOf('@');
//        String start = str.substring(0, index);
//        String end = str.substring(index);
//        if(start.contains("+"))
//            start = start.substring(0, start.indexOf('+'));
//        start = start.replaceAll("\\.", "");
//        set.add(start+ end);
//    }    
//        return set.size();
//    }
//}
