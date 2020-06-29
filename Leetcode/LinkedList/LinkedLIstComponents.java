package leetcode.LinkedList;

import java.util.HashSet;
import java.util.Set;


public class LinkedLIstComponents {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
           for(int num: G){
           set.add(num);
           }
           ListNode temp = head;
           int count = 0;
           while(temp != null){
   //if the next value in Linked list is null or isn't present in set then count wont increase 
           if(set.contains(temp.val) && (temp.next == null || !set.contains(temp.next.val)))
                   count++;
           temp = temp.next;
           }
           return count;    
       }
}
