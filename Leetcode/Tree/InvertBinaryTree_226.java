package leetcode.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_226 {
	
//DFS solution	
//  public TreeNode invertTree(TreeNode root) {
//  if(root == null){
//      return root;
//  }
//      TreeNode tmp = root.left;
//      root.left = root.right;
//      root.right = tmp;
//      invertTree(root.left);
//      invertTree(root.right);
//      return root;
// }
//}
	
//BFS solution	
public TreeNode invertTree(TreeNode root) {
if (root == null) return null;
Queue<TreeNode> queue = new LinkedList<TreeNode>();
queue.add(root);
while (!queue.isEmpty()) {
    TreeNode current = queue.poll();
    TreeNode temp = current.left;
    current.left = current.right;
    current.right = temp;
    if (current.left != null) queue.add(current.left);
    if (current.right != null) queue.add(current.right);
}
return root;
}
}

