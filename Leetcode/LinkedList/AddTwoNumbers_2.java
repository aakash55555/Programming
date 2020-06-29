package leetcode.LinkedList;

// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

//public class AddTwoNumbers_2 {
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//	    int sum = 0, carry = 0;
//	    ListNode l3 = new ListNode(0);
//	    ListNode result = l3; 
//	    while(l1 != null || l2 != null){ 
//	    sum = ((l1 != null)? l1.val : 0) + ((l2 != null)? l2.val : 0) + carry;
//	    carry = sum / 10;
//	    sum = sum  %10;
//	    l3.next = new ListNode(sum);
//	    l3 = l3.next;
//	    if (l1 != null){
//	        l1 = l1.next;
//	    }     
//	    if(l2 != null){
//	        l2 = l2.next;    
//	    }
//	    }
//	        if(carry != 0){
//	        l3.next = new ListNode(carry);
//	            l3 = l3.next;
//	        }
//	        return result.next;
//	    }
//}

//Second solution
public class AddTwoNumbers_2 {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     if(l1 == null && l2 == null)
         return null;
     else if(l1 == null)
         return l2;
     else if(l2 == null)
         return l1;
     else{
        ListNode head1 = new ListNode(0);
        ListNode result = head1;
        int carry = 0;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null && l1.val + l2.val +carry <= 9){
            head1.val =l1.val +l2.val + carry;
            carry = 0;
            l1 = l1.next;
            l2 = l2.next;
            }
            else if(l1 != null && l2 != null && l1.val + l2.val +carry > 9){
            head1.val =(l1.val +l2.val + carry) % 10;
            carry = (l1.val +l2.val + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
            }
            else if(l1 != null && l2 == null && l1.val + carry <= 9){
            head1.val =l1.val + carry;
            carry = 0;
            l1 = l1.next;
            }
            else if(l1 == null && l2 != null && l2.val + carry <= 9){
            head1.val =(l2.val + carry);
            carry = 0;
            l2 = l2.next;
            }
            else if(l1 != null && l2 == null && l1.val + carry > 9){
            head1.val = (l1.val + carry)%10;
            carry = 1;
            l1 = l1.next;
            }
            else if(l1 == null && l2 != null && l2.val + carry > 9){
            head1.val =(l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            l2 = l2.next;
            }
            if(l1 != null || l2 != null){
            ListNode head = new ListNode(0);
            head1.next = head;
            head1 = head1.next;
            }
        }
        if(carry == 1){
            ListNode head = new ListNode(carry);
            head1.next = head;
            head1 = head1.next;
        }
    return result;
    }
}
}
     