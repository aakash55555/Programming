package leetcode.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReorderDataInLogFile_937 {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterlog = new ArrayList<>();
        List<String> digitlog = new ArrayList<>();
        //First we separate the letter logs from digits logs by comparing first letter of second word
        for(String log : logs){
            String[] logg = log.split("\\s+");
            if(logg[1].charAt(0) >= '0' && logg[1].charAt(0) <= '9'){
                digitlog.add(log);
            }
            else{
                letterlog.add(log);
            }
        }
        
        //Compare the String of letter logs by its second word
        //Need StringBuilder for performing the compareTo operation from 2nd word onwards
        Collections.sort(letterlog, new Comparator<String>(){
        @Override
        public int compare(String ob1, String ob2){
         String[] first = ob1.split("\\s+");
         String[] second = ob2.split("\\s+");   
         StringBuilder sb1 = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();
         for(int i = 1; i < first.length; i++){
             sb1.append(first[i]).append(" ");
         }   
        for(int i = 1; i < second.length; i++){
             sb2.append(second[i]).append(" ");
         }
            if(sb1.toString().compareTo(sb2.toString()) == 0)
                return first[0].compareTo(second[0]);
            return sb1.toString().compareTo(sb2.toString());
        }    
            
        });
        //Stored the sorted results first letter logs and then the digit logs.
        String[] output = new String[logs.length];
        int i = 0;
        for(String letter : letterlog)
            output[i++] = letter;
        for(String digit : digitlog)
             output[i++] = digit;
        return output;
    }
}
