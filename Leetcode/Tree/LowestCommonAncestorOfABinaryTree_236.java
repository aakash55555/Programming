package leetcode.Tree;

public class LowestCommonAncestorOfABinaryTree_236 {
	 TreeNode ans;
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        traverse(root, p,q);
	        return ans;
	    }
	    public boolean traverse(TreeNode root, TreeNode p, TreeNode q){
	        if(root == null){
	            return false;
	        }
	        int left = traverse(root.left, p,q)? 1: 0;
	        int right = traverse(root.right, p, q)?1:0;
	        int mid = (root == p || root == q) ?1:0;
	        if(left + right+ mid >= 2){
	            ans = root;
	        }
	        return (mid+left+right >0);
	    }
}
