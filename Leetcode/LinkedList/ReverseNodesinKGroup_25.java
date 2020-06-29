package leetcode.LinkedList;

public class ReverseNodesinKGroup_25 {
	public static ListNode reverseKGroup(ListNode head, int k) {

	ListNode curr = head, prev = null, next = null;

	int c = k;
	while(curr!=null && c !=0) {
		curr = curr.next;
		c--;
	}
	if(c!=0) {
		return head;
	}

	curr = head;
	int count = 0;
	while(curr != null && count < k){
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		count++;
	}
	if (next != null)
		head.next = reverseKGroup(next, k); 
	return prev;
	}
}
