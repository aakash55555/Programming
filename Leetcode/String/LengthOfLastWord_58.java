package leetcode.String;

public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        String[] str = s.split("\\W+");
        return str.length != 0? str[str.length - 1].length() : 0;
    }
}
