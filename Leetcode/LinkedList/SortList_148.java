package leetcode.LinkedList;

public class SortList_148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = FindMiddleNode(head);  
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(mid);
        
        //merging the list
        ListNode mergeDummy = new ListNode(-1);
        ListNode merge = mergeDummy;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                mergeDummy.next = l2;
                l2 = l2.next;
            }
             else{
                mergeDummy.next = l1;
                l1 = l1.next;
            }
            mergeDummy = mergeDummy.next;    
        }  
          if(l1 != null){
              mergeDummy.next = l1;
          } 
          else if(l2 != null){
              mergeDummy.next = l2;
          }
          return merge.next;
       }
          private ListNode FindMiddleNode(ListNode head){
              ListNode dummy = new ListNode(-1);
              dummy.next = head;
              ListNode fast = dummy, slow = dummy;
              while(fast != null && fast.next != null){
                  fast = fast.next.next;
                  slow = slow.next;
              }
              ListNode mid = slow.next;
              slow.next = null;
              return mid;
           }
	}

