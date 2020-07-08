package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal_103 {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        traverse(root, 0);
            return list;
    }
    private void traverse(TreeNode root, int level){
        if(list.size() == level){
            list.add(new ArrayList<Integer>());
        }
        if(level % 2 == 0){
        list.get(level).add(root.val);
        }
        else{
            list.get(level).add(0, root.val);
        }
        if(root.left != null){
            traverse(root.left, level+1);
        }
        if(root.right != null){
            traverse(root.right, level+1);
        }
    }
}
