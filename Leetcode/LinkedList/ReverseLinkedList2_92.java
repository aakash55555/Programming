package leetcode.LinkedList;
public class ReverseLinkedList2_92 {
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	        if(head == null || head.next == null){
	            return head;
	        }
	        ListNode prev = null;
	        ListNode curr = head;
	        while(m > 1){
	            prev = curr;
	            curr = curr.next;
	            m--;
	            n--;
	        }
	        ListNode prevHead = prev;
	        ListNode tail = curr;
	            while(n > 0){
	                ListNode curr_next = curr.next;
	                curr.next = prev;
	                prev = curr;
	                curr = curr_next;
	                n--;
	            }
	        if(prevHead != null){
	            prevHead.next = prev;
	            }
	        else {
	            head = prev;
	        }
	            tail.next = curr;
	        return head;
	    }
}
