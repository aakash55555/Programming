package leetcode.Tree;

public class FlattenBinaryTreeToLinkedList_114 {
	//O(1) space complexity and time complexity O(N) //top down solution
	 public void flatten(TreeNode root) {
	        TreeNode node  = root;
	            while(node != null){
	                if(node.left != null){
	                    TreeNode right_most = node.left;
	                    while(right_most.right != null){
	                        right_most = right_most.right;
	                    }
	                    right_most.right = node.right;
	                    node.right = node.left;
	                    node.left = null;
	                }
	                node = node.right; 
	            }       
	        return; 
	    }
	 
	 //O(N) time and space complexity//bottom up  solution faster solution
//	    public void flatten(TreeNode root) {
//	        traverse(root);
//	        return;
//	    }
//	    private TreeNode traverse(TreeNode root){
//	        if(root == null){
//	            return root;
//	        }
//	        if(root.left == null && root.right == null){
//	            return root;
//	        }
//	        TreeNode leftTail = traverse(root.left);
//	        TreeNode rightTail = traverse(root.right);
//	        if(leftTail != null){
//	            leftTail.right = root.right;
//	            root.right = root.left;
//	            root.left = null;
//	        }
//	        return rightTail == null? leftTail: rightTail;
//	    }
}
