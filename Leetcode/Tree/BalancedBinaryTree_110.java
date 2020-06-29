package leetcode.Tree;

public class BalancedBinaryTree_110 {
//DFS top down approach
	   public boolean isBalanced(TreeNode root) {
	        if (root == null) return true;
	        int leftDepth = depth(root.left);
	        int rightDepth = depth(root.right);
	        
	        if (Math.abs(leftDepth - rightDepth) > 1) 
	            return false;
	        return isBalanced(root.left) && isBalanced(root.right);
	    }
	    
	    public int depth(TreeNode root) {
	        if (root == null) return 0;
	        int left = depth(root.left);
	        int right = depth(root.right);
	        return Math.max(left, right) + 1 ;
	    }
	    
//DFS bottom up approach
	    public boolean isBalance(TreeNode root) {
	        return getHeight(root) != -1;
	    }
	    
	    private int getHeight(TreeNode root) {
	        if (root == null) return 0;
	        
	        int left = getHeight(root.left);
	        int right = getHeight(root.right);
	        
	        if (Math.abs(left - right) > 1 || left == -1 || right == -1) return -1;
	        return Math.max(left, right) + 1;
	    }
}
