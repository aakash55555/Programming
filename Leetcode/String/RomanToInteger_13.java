package leetcode.String;

public class RomanToInteger_13 {
    
    //Not as fast Two Pointer(SPace Complexity and time complexity is O(1))
	
	
    // HashMap<String, Integer> map = new HashMap<>(){{
    // put("I", 1);
    // put("V", 5);    
    // put("X", 10);
    // put("L", 50);    
    // put("C", 100);
    // put("D", 500);
    // put("M", 1000);
    // }};
    // public int romanToInt(String s) {
    // int i = 0, sum = 0;  
    // while(i < s.length() - 1){
    //        String sub = s.substring(i, i+2);
    //        if(map.get(sub.substring(0,1)) < map.get(sub.substring(1))){
    //            sum -= map.get(sub.substring(0,1)); 
    //        }
    //         else{
    //             sum += map.get(sub.substring(0,1)); 
    //         }
    //     i++;
    //    }
    //     sum += map.get(s.substring(i));
    //     return sum;
    // }    
	
	//Space Complexity is O(n)
        public int romanToInt(String s) {
        int[] number = new int[s.length()];
        int i = 0;
        while(i < s.length()){
            switch(s.charAt(i)){
                case 'I':
                    number[i] = 1;
                    break;
                case 'V':
                    number[i] = 5;
                    break;
                case 'X':
                    number[i] = 10;
                    break;
                case 'L':
                    number[i] = 50;
                    break;
                case 'C':
                    number[i] = 100;
                    break;
                case 'D':
                    number[i] = 500;
                    break;
                case 'M':
                    number[i] = 1000;
                    break;
                
            }
            i++;
        }
        int sum = 0;
        i = 0;
        for(i = 0; i< number.length - 1; i++){
            if(number[i] < number[i+1])
                sum = sum - number[i];
            else
                sum = sum + number[i];               
        }
        return sum + number[number.length - 1];           
    }
}
