package leetcode.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CountAndSay_38 {
    // Regex solution, better solutions is the down one
    // public String countAndSay(int n) {
    //     String currSeq = "1";
    //     String regex = "(.)\\1*";
    //     Pattern pattern = Pattern.compile(regex);
    //     for(int i = 1; i<n; i++){
    //         Matcher match = pattern.matcher(currSeq);
    //         StringBuffer nextSeq = new StringBuffer();
    //         while(match.find()){
    //             nextSeq.append(match.group().length() + String.valueOf(match.group().charAt(0)));
    //         }
    //         currSeq = nextSeq.toString();
    //     }
    //     return currSeq;
    // }
    public String countAndSay(int n) {
    String val = "1";
        int count = 0;
        for(int i = 1 ; i < n; i++){
            char character = val.charAt(0);
            count = 1;
            StringBuffer str = new StringBuffer();
            for(int j = 1; j < val.length(); j++){
                if(character != val.charAt(j)){
                    str.append(count);
                    str.append(character);
                    count = 0;
                    character = val.charAt(j); 
                }
                count++;
            }
            str.append(count);
            str.append(character);
            val = str.toString();
        }
        return val;
    }
}
