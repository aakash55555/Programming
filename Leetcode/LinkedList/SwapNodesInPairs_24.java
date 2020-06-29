package leetcode.LinkedList;

public class SwapNodesInPairs_24 {

	//    public ListNode swapPairs(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode prev = head.next;
//        ListNode fast = dummy, slow = dummy;
//        while(slow.next != null && slow.next.next != null){
//            ListNode temp = slow;
//            slow = slow.next;
//            fast = slow.next;
//            slow.next = fast.next;
//            fast.next = slow;
//            temp.next = fast;
//        }
//        if(slow.next == null){
//            slow = slow.next;
//        }
//        return prev;
//    }
	
	// if donot want to use extra if condition at the end
    public ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null){
        return head;
    }
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = head.next, fast = dummy, slow = dummy;
        while(head != null && head.next != null){
            ListNode temp = slow;
            slow = slow.next;
            fast = slow.next;
            slow.next = fast.next;
            fast.next = slow;
            temp.next = fast;
            head = slow.next;
        }
    return prev;
        
        
}
}
