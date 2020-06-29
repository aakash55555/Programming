package leetcode.LinkedList;

public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = slow.next;
        return slow;
    }
    
//        public ListNode middleNode(ListNode head) {
//            ListNode fast = head, slow = head;
//            while(fast != null && fast.next != null){
//                fast = fast.next.next;
//                slow = slow.next;
//            }
//            return slow;
//        }
//    }
}
