
package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class ValidatBinarySearchTree_98 {
    //Used the fact that Inorder traversal gives us sorted List
    List<Integer> list = new ArrayList<>();
    // public boolean isValidBST(TreeNode root) {
    //     list = inOrder(root);
    //     for(int i = 0; i< list.size()-1; i++){
    //         if(list.get(i) >= list.get(i+1)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // private List<Integer> inOrder(TreeNode node){
    //     if(node == null){
    //         return list;
    //     }
    //     inOrder(node.left);
    //     list.add(node.val);
    //     inOrder(node.right);
    //     return list;
    // }
    
    //Inorder
    long prev = Long.MIN_VALUE;  //long is required because they ahve also used the values less tha minimum value of integer
    boolean isBST = true;
       public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
         return inOrder(root, isBST);
           //return isBST;
    }
    private boolean inOrder(TreeNode node, boolean isBST){
        if(node == null){
            return isBST;
        }
        isBST = inOrder(node.left, isBST);
        if(prev >= node.val){
            isBST = false;
        }
        prev = node.val; 
        isBST = inOrder(node.right, isBST);
        return isBST;
    }
}
