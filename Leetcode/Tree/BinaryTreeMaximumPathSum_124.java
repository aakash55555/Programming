package leetcode.Tree;

public class BinaryTreeMaximumPathSum_124 {
	int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        return sum;
    }
    private int traverse(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(traverse(root.left), 0);
        int right =  Math.max(traverse(root.right), 0);
        int path_sum = left + right + root.val;
        sum = Math.max(sum, path_sum);
        return root.val + Math.max(left, right);
    }
}
