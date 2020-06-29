package leetcode.LinkedList;
public class RemoveNthNodeFromEndOfTheList_19 {
    //One pass solution easiest one
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     ListNode dummy = new ListNode(0);
    //     dummy.next = head;
    //     ListNode first = dummy, second = dummy;
    //     for(int i = 1; i <= n+1; i++){
    //         first = first.next;
    //     }
    //     while(first != null){
    //         first = first.next;
    //         second = second.next;
    //     }
    //     second.next = second.next.next;
    //     return dummy.next;
    // }
        //Two pass solution
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0);
        dummy.next = head;
       int count = 0;
       ListNode temp = head;
       while(temp!=null){
           count++;
           temp = temp.next;
       } 
        count -= n;
        temp = dummy;
        while(count > 0){
        count--;    
        temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
    
}
