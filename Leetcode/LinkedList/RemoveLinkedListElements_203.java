package leetcode.LinkedList;

public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode();
    dummy.next = head;
        ListNode temp = head;
        ListNode prev= dummy; 
        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;     
            }
            else{
            prev = temp;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
