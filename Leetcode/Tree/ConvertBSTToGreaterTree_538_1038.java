package leetcode.Tree;

public class ConvertBSTToGreaterTree_538_1038 {
   //Reverse Morris Inorder traversal
    
    //public TreeNode convertBST(TreeNode root) {
      // int sum = 0;
      // TreeNode current = root;
      // while(current != null){
      //     if(current.right == null){
      //         sum += current.val;
      //         current.val = sum;
      //         current = current.left;
      //     }
      //     else{
      //         TreeNode successor = current.right;
      //         while(successor.left != null && successor.left != current)
      //             successor = successor.left;
      //     if(successor.left == null){
      //         successor.left = current;
      //         current = current.right;
      //     }
      //     else{ 
      //         successor.left = null;
      //         sum += current.val;
      //         current.val = sum;
      //         current = current.left;
      //     }
      // }
      // }
      //   return root;
    //}
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
    if(root!= null){
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
    }
        return root;
    }
}
