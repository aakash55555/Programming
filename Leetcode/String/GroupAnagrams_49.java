package leetcode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     if(strs.length == 0){
    //         return new ArrayList<>();
    //     }
    //     Map<String, List> result = new HashMap<>();
    //     for(String str: strs){
    //         char[] ch = str.toCharArray();
    //         Arrays.sort(ch);
    //         String s = String.valueOf(ch);
    //         if(!result.containsKey(s)) result.put(s, new ArrayList());
    //         result.get(s).add(str);
    //     }
    //     return new ArrayList(result.values());
    // }
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs.length == 0){
            return new ArrayList<>();
        }
        int[] arr = new int[26];
        Map<String, List> map = new HashMap<>();
        for(String str : strs){
            Arrays.fill(arr, 0);
            for(char ch: str.toCharArray()){
                arr[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i =0; i < 26; i++){
                sb.append("#");
                sb.append(arr[i]);
            }
            String st = sb.toString();
            if(!map.containsKey(st)) map.put(st, new ArrayList());
            map.get(st).add(str);
        }
        return new ArrayList(map.values());
    }
}
