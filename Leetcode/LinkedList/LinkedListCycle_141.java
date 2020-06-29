package leetcode.LinkedList;

public class LinkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
          ListNode p1 = head;
          ListNode p2 = head;
          while(p2 != null && p2.next != null){// while(p2 !=null && p1 != null) will also work
              p1 = p1.next;
              p2 = p2.next.next;
              if(p1 == p2){
                  return true;
              }
          }
          return false;
      }
}
