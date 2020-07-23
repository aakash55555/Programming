package leetcode.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	List<List<Integer>> list = new ArrayList<>();
     public List<List<Integer>> levelOrder(TreeNode root) {
         if(root == null){
             return new ArrayList<>();
         }
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         TreeNode node;
         while(!queue.isEmpty()){
             LinkedList<Integer> temp_list = new LinkedList<>();
             int size = queue.size();
             for(int i = 0; i < size; i++){
                 node = queue.poll();
                 temp_list.add(node.val);
                 if(node.left != null){
                     queue.add(node.left);
                 }
                 if(node.right != null){
                     queue.add(node.right);
                 }
             }
             list.add(temp_list);
         }
         return list;
     }
}
