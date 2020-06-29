package leetcode.LinkedList;

public class PartitionList_86 {
	 public ListNode partition(ListNode head, int x) {
	        ListNode dummyAfter = new ListNode(0);
	        ListNode after = dummyAfter;
	        ListNode dummyBefore = new ListNode(0);
	        ListNode before = dummyBefore;
	        while(head != null){
	            if(head.val >= x){
	                dummyAfter.next = head;
	                dummyAfter = dummyAfter.next;
	            }
	        else{
	            dummyBefore.next = head;
	            dummyBefore = dummyBefore.next;
	        }
	            head = head.next;
	        }
	            dummyAfter.next = null;
	            dummyBefore.next = after.next;
	            return before.next;
	    }
}
