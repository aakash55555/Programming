package leetcode.LinkedList;

//Iterative Method
public class ReverseLinkedList_206 {
	public ListNode reverseList(ListNode head) {
	    if (head == null || head.next == null) return head;
	    ListNode prev = null;
	    ListNode curr = head;
	    while(head != null){
	        curr = head.next;
	        head.next = prev;
	        prev = head;
	        head = curr;
	    }
	        return prev;
	}
}

//Recursive Method
class ReverseLinkedLis {
	class Solution {
		public ListNode reverseList(ListNode head) {
		    if (head == null || head.next == null) return head;
		    ListNode p = reverseList(head.next);
		    head.next.next = head;
		    head.next = null;
		    return p;
		}
		} 
}

