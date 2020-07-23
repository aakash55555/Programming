package leetcode.Tree;

import java.util.LinkedList;
import java.util.Queue;

//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 //Solution 1 DFS
// class MaximumDepthBinaryTree_104 {
//   public int maxDepth(TreeNode root) {
//     if (root == null) {
//       return 0;
//     } else {
//       int left_height = maxDepth(root.left);
//       int right_height = maxDepth(root.right);
//       return left_height > right_height ? left_height +  1 : right_height + 1;
//     }
//   }
// }


//Solution 2 BFS
class MaximumDepthBinaryTree_104 {
    public int maxDepth(TreeNode root) {
    if(root == null){
        return 0;
    }
    int size;
    int count = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        size = queue.size();
        count++;
        for(int i = 0; i< size; i++){
        TreeNode temp = queue.poll();    
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
    }
    return count;
}
}