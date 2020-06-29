package leetcode.LinkedList;

public class AddTwoNumbersII_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }   
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;  
        int sum = 0, carry = 0;
        while(l1 !=null || l2 != null){
           sum = ((l1 == null) ? 0 :l1.val) + ((l2 == null) ? 0: l2.val) + carry;
           carry  = sum / 10;
           l3.next = new ListNode(sum % 10);
           if(l1 != null){
               l1 = l1.next;
           } 
            if(l2 != null){
                l2 = l2.next;
            }
            l3 = l3.next;
        }
          if( carry == 1){
              l3.next = new ListNode(carry);
          }
          return reverse(dummy.next);
      }
      private ListNode reverse(ListNode head){
          if(head.next == null){
              return head;
          }
          ListNode p = reverse(head.next);
          head.next.next = head;
          head.next = null;
          return p;
      }
}
