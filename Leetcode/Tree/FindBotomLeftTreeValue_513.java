package leetcode.Tree;

public class FindBotomLeftTreeValue_513 {
	   int depth = -1, val = 0;
	    public int findBottomLeftValue(TreeNode root) {
	        traverse(root, 0);
	        return val;
	        }
	    private int traverse(TreeNode root, int level){
	      if(root == null){
	           return 0;
	       } 
	        if(depth < level){
	            depth = level;
	            val = root.val;
	        }
	            traverse(root.left, level+1);
	            traverse(root.right, level+1); 
	        return val;
	    }
}
