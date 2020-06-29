package leetcode.Tree;

public class DiameterOfABinaryTree_543 {
	 int diameter = 0;
	    public int diameterOfBinaryTree(TreeNode root) {
	        if(root == null || (root.left == null && root.right == null))
	            return 0;
	       traverseTree(root); 
	       return diameter - 1; 
	        
	    }
	    private int traverseTree(TreeNode root){
	        if(root == null)
	            return 0;
	        int left = traverseTree(root.left);
	        int right = traverseTree(root.right);
	        diameter = Math.max(diameter, left+ right +1) ;
	        return Math.max(left, right) + 1;
	    }
	    
}
