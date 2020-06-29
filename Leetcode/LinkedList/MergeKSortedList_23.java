package leetcode.LinkedList;

import java.util.PriorityQueue;

public class MergeKSortedList_23 {
    //With O(n) space
    // public ListNode mergeKLists(ListNode[] lists) {
    //     List<Integer> list = new ArrayList<>();
    //     for(ListNode node: lists){
    //         while(node != null){
    //             list.add(node.val);
    //             node = node.next;
    //         }
    //     }       
    //     Collections.sort(list);
    //     ListNode dummy = new ListNode(0);
    //     ListNode head = dummy;
    //     for(int val : list){
    //         ListNode next_val = new ListNode(val);
    //         dummy.next = next_val;
    //         dummy = dummy.next;
    //     }
    //     dummy.next = null;
    //     return head.next;
    // }
    
    //With MinHeap...Priority Queue and no need to sort Better than above but not optimal solution
        public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(ListNode node: lists){
            while(node != null){
                queue.add(node.val);
                node = node.next;
            }
        }       
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(!queue.isEmpty()){
            dummy.next = new ListNode(queue.remove());
            dummy = dummy.next;
        }
        dummy.next = null;
        return head.next;
    }
}
