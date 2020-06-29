package leetcode.LinkedList
;
import java.util.HashSet;
import java.util.Set;
public class IntersectionOfTwoLinkedLists_160 {

	//Brute Force Approach
	//	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> set = new HashSet<>();
//        ListNode temp = headA;
//        while(temp != null){
//            set.add(temp);
//            temp = temp.next;
//        }
//        temp = headB;
//        while(temp != null){
//            if(!set.add(temp)){
//                return temp;
//            }
//            temp = temp.next;
//        }
//        return null;
//    }
	
    //Better Approach 
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null){
        return null;
    }
    ListNode a = headA, b = headB;
        while(a != b){
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;    
        }
        return b;
    }	
}
