package leetcode.LinkedList;


public class LinkedListCycleII_142 {
	//Basic Hashset solution
//  public ListNode detectCycle(ListNode head) {
//      if(head == null){
//          return null;
//      }
//      ListNode temp = head;
//      Set<ListNode> set = new HashSet<>();        
//      while(temp != null){
//          if(!set.add(temp)){
//              return temp;
//          }
//          temp = temp.next;
//      }
//      return null;
//  }

//Solution 2 
 public ListNode detectCycle(ListNode head) {
     if(head == null){
         return null;
     }
     ListNode slow = head, fast = head;        
     while(fast != null && fast.next != null){
         fast = fast.next.next;
         slow = slow.next;
         if(fast == slow){
             break;
         }
     }
     if(fast == null || fast.next == null){
     return null;
     }
     
     slow = head;
     
     while(slow != fast){
         fast = fast.next;
         slow = slow.next;
     }
     return fast;
 }
}
