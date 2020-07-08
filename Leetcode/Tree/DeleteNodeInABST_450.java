package leetcode.Tree;

public class DeleteNodeInABST_450 {
	 public int successor(TreeNode root){
	        root = root.right;
	        while(root.left != null){
	            root = root.left;
	        }
	        return root.val;
	    }
	    public int predecessor(TreeNode root){
	        root = root.left;
	        while(root.right != null){
	            root = root.right;
	        }
	        return root.val;
	    }
	    public TreeNode deleteNode(TreeNode root, int key) {
	      if(root == null){
	          return null;
	      }  
	        if(key > root.val)
	            root.right = deleteNode(root.right, key);
	        else if(key < root.val)
	            root.left = deleteNode(root.left, key);
	        else{
	            if(root.left == null && root.right == null){
	                return null;
	            }
	            if(root.right != null){
	            root.val = successor(root);
	                System.out.print("value = "+root.val);
	            root.right = deleteNode(root.right, root.val);    
	            }
	        else {
	            root.val = predecessor(root);
	            root.left = deleteNode(root.left, root.val);
	      }
	        }
	        return root;
	    }
}
