package leetcode.LinkedList;

public class PalindromeLinkedList_234 {

	
	//    ListNode temp;
//    public boolean isPalindrome(ListNode head) {
//    if(head == null || head.next == null){
//        return true;
//    }
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode fast = dummy, slow = dummy;
//        while(fast.next != null && fast.next.next != null){
//            fast = fast.next.next;
//            slow= slow.next;
//        }
//        fast = slow.next;
//        slow.next = null;
//        slow = fast;
//        fast = head;
//        slow = reverse(slow);
//        while(fast != null){
//            if(fast.val != slow.val){
//                return false;
//            }
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return true;
//    }
//    private ListNode reverse(ListNode head){
//        if(head == null)
//            return head;
//    ListNode prev = null;
//    ListNode curr = head;
//    while(head != null){
//        curr = head.next;
//        head.next = prev;
//        prev = head;
//        head = curr; 
//    }
//    return prev;
//    }

    ListNode temp;
    public boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null){
        return true;
    }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        while(fast != null && fast.next != null){//In the above solution while(fast.next != null && fast.next.next !=null) )
            fast = fast.next.next;
            slow= slow.next;
        }
        fast = slow.next;
        slow.next = null;
        slow = fast;
        fast = head;
        slow = reverse(slow);
        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        if(head == null)
            return head;
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
