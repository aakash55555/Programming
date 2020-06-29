package leetcode.LinkedList;

public class RemoveDuplicatesFromSortedListII_82 {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null){
	            return head;
	        }
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        int count = 0;
	        ListNode prev = dummy, p1 = head, p2 = head.next;
	        while(p2 != null){
	            if (p1.val == p2.val){
	                count = 1;
	            }
	            else if(p1.val != p2.val && count == 1){
	                count = 0;
	            }
	            else if (p1.val != p2.val && count == 0){
	                prev.next = p1;
	                prev = prev.next;
	                count = 0;
	            }
	            p1 = p1.next;
	            p2 = p2.next;
	        }
	        if(count == 0){
	            prev.next = p1;
	            prev= prev.next;
	        }
	        else if(count == 1){
	            prev.next = null; 
	        }
	        return dummy.next;
	    }
	 
	 //Better solution
	    // public ListNode deleteDuplicates(ListNode head) {
	    //     ListNode dummy = new ListNode(0), dummyHead = dummy,cur=head;
	    //     while(cur!=null ){
	    //        if(cur.next!=null&& cur.val ==cur.next.val){
	    //            while(cur.next!=null && cur.val == cur.next.val){
	    //                cur=cur.next;
	    //            }
	    //        }
	    //         else{
	    //             dummy.next=cur;
	    //             dummy=dummy.next;
	    //         }
	    //         cur=cur.next;
	    //     }
	    //     dummy.next = null;
	    //     return dummyHead.next;
	    // }
}
