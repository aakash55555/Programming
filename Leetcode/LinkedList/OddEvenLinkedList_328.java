package leetcode.LinkedList;
//Solution1 by me
public class OddEvenLinkedList_328 {
	public ListNode oddEvenList(ListNode head) {
    if(head == null ||head.next == null || head.next.next ==null){
        return head;
    }  
    ListNode dummy = new ListNode(0);
    ListNode slow = head, fast = head.next;
      dummy.next = fast;
      while(fast.next != null && fast.next.next != null){
          slow.next = fast.next;
          slow = slow.next;
          fast.next = slow.next;
          fast = fast.next;
      }
      if(fast.next == null){
          slow.next = dummy.next;
      }
      else if(fast.next.next == null){
          slow.next = fast.next;
          fast.next = null;
          slow = slow.next;
          slow.next = dummy.next;
      }
      return head;
	}
}


//Solution2 
class Solution {
    public ListNode oddEvenList(ListNode head) {
      if(head == null ||head.next == null || head.next.next ==null){
          return head;
      }  
      ListNode dummy = new ListNode(0);
      ListNode slow = head, fast = head.next;
        dummy.next = fast;
        while(fast != null && fast.next != null){
            slow.next = fast.next;
            slow = slow.next;
            fast.next = slow.next;
            fast = fast.next;
        }
        slow.next = dummy.next;
        return head;
    }
}