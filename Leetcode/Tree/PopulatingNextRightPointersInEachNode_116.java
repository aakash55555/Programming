package leetcode.Tree;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class PopulatingNextRightPointersInEachNode_116 {
	//O(N) Time and space O(1)
	   // public Node connect(Node root) {
    //   if(root == null){
    //       return root;
    //   } 
    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);
    //     while(queue.size() > 0){
    //         int size = queue.size();
    //         for(int i = 0; i < size; i++){
    //         Node node = queue.poll();
    //             if(i < size - 1){
    //             node.next = queue.peek();    
    //             }
    //            if(node.left != null){
    //                queue.add(node.left);
    //            } 
    //            if(node.right != null){
    //                queue.add(node.right);
    //            } 
    //         }
    //     }
    //     return root;
    // }
	
	//O(N) and O(N) //faster
    public Node connect(Node root) {
    if(root == null){
        return root;
    }
     Node leftmost = root;
     while(leftmost.left != null){
         Node head = leftmost;
         while(head != null){
             head.left.next = head.right;
             if(head.next != null){
                 head.right.next = head.next.left;
             }
             head = head.next;
         }
         leftmost = leftmost.left;
     }  
        return root;
    }
}
