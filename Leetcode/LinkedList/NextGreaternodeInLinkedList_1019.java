package leetcode.LinkedList;

public class NextGreaternodeInLinkedList_1019 {
	
	//This time solution
//    public int[] nextLargerNodes(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        ListNode temp = head;
//        int count = 0;
//        while(temp != null){
//            count++;
//            temp = temp.next;
//        }
//        int[] list = new int[count];
//        int i = 0;
//        temp = head;
//        while(temp.next != null){
//            slow = temp;
//            fast = temp.next;
//            while(fast != null && slow.val  >= fast.val){
//                fast = fast.next;
//            }   
//            if(fast == null){
//                list[i] = 0;
//                i++;
//            }
//            else{
//                list[i] = fast.val;
//                i++;
//            }
//            temp = temp.next;
//        }
//        return list;
//    }
 
	
	//Last time solution
//    public int[] nextLargerNodes(ListNode head) {
//        ListNode temp = head, temp2 = head;
//        int count = 0;
//        while(temp != null){
//            count++;
//            temp = temp.next;
//        }
//        int[] list = new int[count];
//        temp = head;
//        count = 0;
//        while(temp != null){
//            if(temp2.val <= temp.val && temp2.next != null){
//            temp2 = temp2.next;
//            }
//            else if(temp2.val > temp.val){
//                list[count] = temp2.val;
//                count++;
//                temp = temp.next;
//                temp2 = temp;
//            }
//            else if(temp2.next == null){
//                list[count] = 0;
//                count++;
//                temp = temp.next;
//                temp2 = temp;
//            }
//        }
//        return list;
//    }
    
	//Last to last time solution
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head, temp2 = head;
        int size = 0, i = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int[] val = new int[size];
        temp = head;
        for(int j = 0; j < size - 1; j++){
        while(temp != null){
            if(temp2.val < temp.val){
             val[i] = temp.val;
              i++;
              break;
            }
            temp = temp.next;
        }
            if(temp == null){
                val[i] = 0;
                i++;
            }
            temp2 = temp2.next;
            temp = temp2.next;
        }
        return val;
    }
}
