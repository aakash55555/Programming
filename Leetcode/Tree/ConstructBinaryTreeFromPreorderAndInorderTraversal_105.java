package leetcode.Tree;

import java.util.HashMap;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal_105 {
	 int pre_ind = 0;
	    HashMap<Integer, Integer> map = new HashMap<>();
	    int[] preorder, inorder;    
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        this.preorder = preorder;
	        this.inorder= inorder;
	        int index = 0;
	        for(Integer inor : inorder)
	            map.put(inor, index++);
	        return createTree(0, inorder.length);
	    }
	    private TreeNode createTree(int start, int end){
	        if(start == end){
	            return null;
	        }
	        int val = preorder[pre_ind];
	        TreeNode root = new TreeNode(val);
	        int index = map.get(val);
	        pre_ind++;
	        root.left = createTree(start, index);
	        root.right = createTree(index + 1, end); 
	        return root;    
	    } 
}
