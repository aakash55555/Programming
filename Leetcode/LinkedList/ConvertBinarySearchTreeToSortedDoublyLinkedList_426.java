package leetcode.LinkedList;

//Definition for a Node.
class Node {
 public int val;
 public Node left;
 public Node right;

 public Node() {}

 public Node(int _val) {
     val = _val;
 }

 public Node(int _val,Node _left,Node _right) {
     val = _val;
     left = _left;
     right = _right;
 }
};
public class ConvertBinarySearchTreeToSortedDoublyLinkedList_426 {
	 Node first = null, last = null;
	    public Node treeToDoublyList(Node root) {
	        if(root == null){
	            return null;
	        }
	    traverseTree(root);
	        last.right = first;
	        first.left = last;
	        return first;
	    }
	    private void traverseTree(Node root){
	        if(root != null){
	            traverseTree(root.left);
	            if(last != null) {
	                last.right = root;
	                root.left = last;
	            }
	            else{
	                first = root;
	            }
	            last= root;
	            traverseTree(root.right);
	        }
	    }
}
