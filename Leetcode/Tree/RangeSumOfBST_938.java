package leetcode.Tree;

import java.util.Stack;

public class RangeSumOfBST_938 {
    // public int rangeSumBST(TreeNode root, int L, int R) {
    //    if(root == null){
    //        return 0;
    //    } 
    //     if(root.val < L){
    //         return rangeSumBST(root.right, L, R);
    //     }
    //     if(root.val > R){
    //         return rangeSumBST(root.left, L,R);
    //     }
    //     return root.val + rangeSumBST(root.left, L,R) + rangeSumBST(root.right, L,R);
    // }
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node != null){
                if(node.val >= L && node.val <=R){
                    sum += node.val;                     
                }
                if(node.val >= L) {
                    stack.push(node.left);
                }
                if(node.val <= R){
                    stack.push(node.right);
                }
            }
        }
        return sum;
    }
}

