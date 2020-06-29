package leetcode.Tree;

import java.util.LinkedList;

public class PathSum_112 {
//  public boolean hasPathSum(TreeNode root, int sum) {
//  if(root == null){
//      return false;
//  }
//  sum = sum- root.val;
//  if(root.left == null && root.right == null){
//      return sum == 0 ?true:false;
//  }
//  return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
//}
public boolean hasPathSum(TreeNode root, int sum) {
if(root == null)
  return false;
LinkedList<TreeNode> node = new LinkedList();
LinkedList<Integer> node_val = new LinkedList();
node.add(root);
node_val.add(sum - root.val);

TreeNode treenode;
int curr_val;
while(!node.isEmpty()){
  treenode = node.pollLast();
  curr_val = node_val.pollLast();
  if(treenode.left == null && treenode.right == null && curr_val == 0)
      return true;
  if(treenode.left != null){
      node.add(treenode.left);
      node_val.add(curr_val - treenode.left.val);
  }
  if(treenode.right != null){
      node.add(treenode.right);
      node_val.add(curr_val - treenode.right.val);
  }
}
return false;
}
}
