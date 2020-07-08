package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {
	  // List<Integer> list = new ArrayList<>();
    // public List<Integer> inorderTraversal(TreeNode root) {
    //    if(root == null){
    //        return list;
    //    }  
    //    inorderTraversal(root.left);
    //    list.add(root.val);
    //    inorderTraversal(root.right);
    //    return list; 
    // }
    
    //Morris Traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode current = root;
        while(current != null){
            if(current.left == null){
               list.add(current.val); 
               current = current.right; 
            }
            else{
                TreeNode predecessor = current.left;
                while(predecessor.right != null && predecessor.right != current){
                    predecessor = predecessor.right;
                }
                if(predecessor.right == null){
                    predecessor.right = current;
                    current = current.left;
                }
                else{
                    predecessor.right = null;
                    list.add(current.val);
                    current = current.right;
                }
            }
        }
        return list;
    }
}
