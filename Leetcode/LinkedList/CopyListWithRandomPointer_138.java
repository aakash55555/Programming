package leetcode.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer_138 {

	// Definition for a Node.
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
    //We are creating node wuth random and next as null and value of the
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Map<Node, Node> map = new HashMap<>();
        Node p1 = new Node(head.val);
        map.put(head, p1);
        Node p2 = head;
        while(p2 != null){
            Node randomNode= p2.random;
            Node nextNode = p2.next;
            if(randomNode != null){
                if(!map.containsKey(randomNode)){
                    map.put(randomNode, new Node(randomNode.val));
                }
                p1.random = map.get(randomNode);
            }
                if(nextNode != null){
                if(!map.containsKey(nextNode)){
                    map.put(nextNode, new Node(nextNode.val));
                }
                p1.next = map.get(nextNode);
            }
            p1 = p1.next;
            p2 = p2.next;
        }
            return map.get(head);
    }
}
