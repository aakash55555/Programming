package leetcode.Tree;

import java.util.LinkedList;
import java.util.Queue;

//My code
//public class SymmetricTree_101 {
//    //DFS commented code was extra but it was also working
//    public boolean isSymmetric(TreeNode root) {
//     if(root == null || (root.left == null && root.right == null)){
//         return true;
//     }
//     else if(root.left == null || root.right == null){
//         return false;
//     }
//     if(root.left.val != root.right.val){
//         return false;
//     }
//    else 
//    return traverse(root.left, root.right);
//}
//private boolean traverse( TreeNode left, TreeNode right){
//    if(left == null && right == null){
//        return true;
//    }
//    else if(left == null || right == null){
//        return false;
//    }
//    if(left.val != right.val){
//        return false;
//    }
//    return traverse(left.left, right.right) && traverse(left.right, right.left);
//    
//       }
//}

//Better code DFS
//public class SymmetricTree_101 {
////DFS commented code was extra but it was also working
//public boolean isSymmetric(TreeNode root) {
//return traverse(root, root);
//}
//private boolean traverse( TreeNode left, TreeNode right){
//if(left == null && right == null){
//  return true;
//}
//else if(left == null || right == null){
//  return false;
//}
//if(left.val != right.val){
//  return false;
//}
//return traverse(left.left, right.right) && traverse(left.right, right.left);
//
// }
//}




//BFS
public class SymmetricTree_101 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
          if(p == null && q == null){
              return true; 
          }  
          else if(p == null || q == null){
              return false; 
          }  
          else if(p != null && q != null){
              queue1.add(p);
              queue1.add(q);
          }
        while(!queue1.isEmpty()){
            TreeNode p1 = queue1.poll();
            TreeNode q1 = queue1.poll();
            
          if(p1 == null && q1 == null){
              continue;
          }  
          if(p1 == null || q1 == null){
              return false; 
          }  
          if(p1.val != q1.val){
              return false;
          } 
              queue1.add(p1.left);
              queue1.add(q1.left);
              queue1.add(p1.right);
              queue1.add(q1.right);
        }
                return true;                     
}

	 }