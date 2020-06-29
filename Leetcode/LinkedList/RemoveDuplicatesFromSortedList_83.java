package leetcode.LinkedList;

public class RemoveDuplicatesFromSortedList_83 {
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        int count = 0;
//        ListNode prev = dummy; 
//        ListNode temp = head, temp2 = head.next;
//        while(temp2 != null){
//            if(temp.val != temp2.val){
//                prev.next = temp;
//                prev = prev.next;
//                count = 0;
//            }
//            else{
//                count = 1;
//            }
//            temp = temp.next;
//            temp2 = temp2.next;
//        }
//            prev.next = temp;
//            prev= prev.next;
//        return dummy.next;
//    }
	
	//Better solution
    public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null){
        return head;
    }
    ListNode current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
}
}
