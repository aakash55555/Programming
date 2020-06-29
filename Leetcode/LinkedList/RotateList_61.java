package leetcode.LinkedList;

public class RotateList_61 {
	 public ListNode rotateRight(ListNode head, int k) {
	        if(head == null || head.next == null){
	            return head;
	        }
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        ListNode temp = head;
	        int count = 0;
	        ListNode first = dummy, second = dummy;
	        while(temp != null){
	            count++;
	            temp = temp.next;
	        }
	        k = k % count;
	        for(int i = 1; i<= k+1; i++){
	            first = first.next;
	        }
	        while(first.next != null){
	            first = first.next;
	            second = second.next;
	        }
	        second= second.next;
	        first.next = dummy.next;
	        dummy.next = second.next; 
	        second.next = null;
	        return dummy.next; 
	    }
}
