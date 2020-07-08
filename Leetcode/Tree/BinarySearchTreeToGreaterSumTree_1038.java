package leetcode.Tree;

public class BinarySearchTreeToGreaterSumTree_1038 {
	 public TreeNode bstToGst(TreeNode root) {
	        TreeNode current  = root;
	        int sum = 0;
	        while(current != null){
	            if(current.right == null){
	                sum += current.val;
	                current.val = sum;
	                current = current.left;
	            }
	            else{
	                TreeNode successor = current.right;
	                while(successor.left != null && successor.left != current)
	                    successor = successor.left;
	                if(successor.left == null){
	                    successor.left= current;
	                    current = current.right;
	                }
	                else{
	                    successor.left = null;
	                    sum += current.val;
	                    current.val = sum;
	                    current = current.left;
	                }
	            }
	        }
	        return root;
	    }
}
