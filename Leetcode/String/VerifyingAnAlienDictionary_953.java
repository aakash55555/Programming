package leetcode.String;

public class VerifyingAnAlienDictionary_953 {
    public boolean isAlienSorted(String[] words, String order) {          
    int[] index = new int[26]; 	
    for(int j = 0; j < order.length(); j++){
    index[order.charAt(j) - 'a'] = j; 
    }    
    boolean flag = true;
     for(int i = 0; i < words.length - 1; i++){
        int len1 = words[i].length(), len2 = words[i+1].length();
         int len = len1 > len2? len2 : len1;
         int k = 0;
             for(k = 0; k < len; k++){
            if(words[i].charAt(k) != words[i+1].charAt(k)){
                if(index[words[i].charAt(k) - 'a'] > index[words[i+1].charAt(k) - 'a']){
                    flag = false;
                    return flag;
                }
                break;
            }
        }
         if( k == len && len1 > len2){
             flag = false;
             break;
         }
     }
         return flag;                                                   
    }
}
