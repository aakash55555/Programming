package leetcode.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_102 {
//  List<List<Integer>> list = new ArrayList<>();
//  public List<List<Integer>> levelOrder(TreeNode root) {
//      if(root == null){
//          return list;
//      }
//      traverseTree(root, 0);
//      return list;
//  }
//  private void traverseTree(TreeNode root, int levels){
//      if(list.size() == levels){
//          list.add(new ArrayList<Integer>());
//      }
//      list.get(levels).add(root.val);
//      if(root.left != null){
//          traverseTree(root.left, levels + 1);
//      }
//      if(root.right != null){
//          traverseTree(root.right, levels + 1);
//      }
//}

//BFS

     public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> levels = new ArrayList<List<Integer>>();
     if (root == null) return levels;

     ArrayDeque<TreeNode> nextLevel = new ArrayDeque() {{ offer(root); }};
     ArrayDeque<TreeNode> currLevel = new ArrayDeque();        

     while (!nextLevel.isEmpty()) {
         currLevel = nextLevel.clone();
         nextLevel.clear();
         levels.add(new ArrayList<Integer>());

         for (TreeNode node : currLevel) {
             // append the current node value
             levels.get(levels.size() - 1).add(node.val);

             // process child nodes for the next level
             if (node.left != null) 
                 nextLevel.offer(node.left);    
             if (node.right != null) 
                 nextLevel.offer(node.right);
         }   
     }
     return levels;
}
}
