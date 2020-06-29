package leetcode.Tree;

import java.util.ArrayList;

public class BSTIterator_173 {
    ArrayList<Integer> arr;
    int index;

    public BSTIterator_173(TreeNode root) {
        arr = new ArrayList<>();
        index  = -1;
        inorder(root);
    }
    private void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    
    /** @return the next smallest number */
    public int next() {
        return arr.get(++index);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return index + 1 < arr.size();
    }
}
