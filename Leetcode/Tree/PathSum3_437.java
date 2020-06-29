package leetcode.Tree;

public class PathSum3_437 {
    int count =0;
  public int pathSum(TreeNode root, int sum) {
      if(root==null) return 0;
		
      haspathSum(root, sum);
      pathSum(root.left, sum);
      pathSum(root.right, sum);
      
      return count;
  }
  
  public void haspathSum(TreeNode root, int sum){
      if(root == null) return;
      
      if(sum==root.val)
      {
          count++;
      }
      
      haspathSum(root.left, sum-root.val);
      haspathSum(root.right, sum-root.val);
  }
}
