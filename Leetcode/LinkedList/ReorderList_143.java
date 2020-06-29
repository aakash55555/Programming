package leetcode.LinkedList;

public class ReorderList_143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head, slow = head;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
       } 
       fast = slow.next;
       slow.next = null;
       slow = head;
       fast = reverse(fast);
        ListNode curr = slow, fast_curr = fast;
        while(fast != null){
           curr = slow.next;
           fast_curr = fast.next;
           slow.next = fast;
           fast.next = curr;
           slow = curr;
           fast = fast_curr;
       } 
        return; 
    }
    private ListNode reverse(ListNode fast){
        if(fast == null || fast.next == null){
            return fast;
        }
        ListNode prev = null;
        ListNode curr = fast;
        while(fast != null){
            curr = fast.next;
            fast.next = prev;
            prev = fast;
            fast = curr;
        }
        return prev;
    }
}
