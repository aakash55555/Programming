package leetcode.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree_100 {
    // public boolean isSameTree(TreeNode p, TreeNode q) {
    //     if(p == null && q == null){
    //         return true;
    //     }
    //     else if((p != null && q == null) || (p == null && q != null)){
    //         return false;
    //     }
    //     if(p.val != q.val){
    //         return false;
    //     }
    //     return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    // }
    
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
