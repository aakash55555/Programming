package leetcode.Tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths_257 {
	 // LinkedList<String> paths = new LinkedList<>();
    // public List<String> binaryTreePaths(TreeNode root) {
    // create_path(root, "", paths);
    //     return paths;
    // }
    // public void create_path(TreeNode root, String path, LinkedList<String> paths){
    //     if(root != null){
    //         path += Integer.toString(root.val);
    //         if(root.left == null && root.right == null){
    //             paths.add(path);
    //         }
    //         else{
    //             path += "->";
    //             create_path(root.left, path, paths);
    //             create_path(root.right, path, paths);
    //         }
    //     }
    // }
    
     public List<String> binaryTreePaths(TreeNode root) {
    LinkedList<String> paths = new LinkedList();
    if (root == null)
      return paths;

    LinkedList<TreeNode> node_stack = new LinkedList();
    LinkedList<String> path_stack = new LinkedList();
    node_stack.add(root);
    path_stack.add(Integer.toString(root.val));
    TreeNode node;
    String path;
    while ( !node_stack.isEmpty() ) {
      node = node_stack.pollLast();
      path = path_stack.pollLast();
      if ((node.left == null) && (node.right == null))
        paths.add(path);
      if (node.left != null) {
        node_stack.add(node.left);
        path_stack.add(path + "->" + Integer.toString(node.left.val));
      }
      if (node.right != null) {
        node_stack.add(node.right);
        path_stack.add(path + "->" + Integer.toString(node.right.val));
      }
    }
         return paths;
}
}

