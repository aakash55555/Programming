package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
         int max = Integer.MIN_VALUE;
         String[] str = paragraph.split("\\s+");
         for(String s: str){
             map.put(s.toLowerCase(), (map.getOrDefault(s.toLowerCase(), 0)+1));
             }
         for(String s: banned){
             if(map.containsKey(s.toLowerCase())){
                 map.remove(s.toLowerCase());
             }
         }
         String result = "";
         for(Map.Entry<String, Integer> map1 : map.entrySet()){
             if(map1.getValue() > max){
                 max = map1.getValue();
                 result = map1.getKey();
             }
         }
         return result;
     }
}
