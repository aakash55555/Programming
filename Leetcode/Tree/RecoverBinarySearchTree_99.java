package leetcode.Tree;

public class RecoverBinarySearchTree_99 {
	 TreeNode first = null, second = null, prev = null;
	    public void recoverTree(TreeNode root) {
	        traverseInorder(root);
	        int temp = second.val;
	        second.val = first.val;
	        first.val = temp;
	    }
	    public void traverseInorder(TreeNode root){
	        if(root == null){
	            return;
	        }
	        traverseInorder(root.left);
	        if(prev != null){
	            if(prev.val > root.val){
	                if(first == null){
	                    first = prev;
	                }
	                second = root;
	            }
	        }
	        prev = root;
	        traverseInorder(root.right);
	    }
}
