package leetcode.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MergeBinaryTrees_617 {
//By DFS
//	     public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//	         if(t1 == null){
//	             return t2;
//	         }
//	         if(t2 == null){
//	             return t1;
//	         }
//	     t1.val = t1.val + t2.val;
//	     t1.left = mergeTrees(t1.left, t2.left);
//	     t1.right = mergeTrees(t1.right, t2.right);
//	     return t1;
//	         }
	// }

	//using queue
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        if (t1 == null)
	            return t2;
	        Queue < TreeNode[] > queue = new LinkedList < > ();
	        queue.add(new TreeNode[] {t1, t2});
	        while (!queue.isEmpty()) {
	            TreeNode[] t = queue.poll();
	            if (t[0] == null || t[1] == null) {
	                continue;
	            }
	            t[0].val += t[1].val;
	            if (t[0].left == null) {
	                t[0].left = t[1].left;
	            } else {
	                queue.add(new TreeNode[] {t[0].left, t[1].left});
	            }
	            if (t[0].right == null) {
	                t[0].right = t[1].right;
	            } else {
	                queue.add(new TreeNode[] {t[0].right, t[1].right});
	            }
	        }
	        return t1;
	    }
	    //By stack BFS
	    // public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	    //     if (t1 == null)
	    //         return t2;
	    //     Stack < TreeNode[] > stack = new Stack < > ();
	    //     stack.push(new TreeNode[] {t1, t2});
	    //     while (!stack.isEmpty()) {
	    //         TreeNode[] t = stack.pop();
	    //         if (t[0] == null || t[1] == null) {
	    //             continue;
	    //         }
	    //         t[0].val += t[1].val;
	    //         if (t[0].left == null) {
	    //             t[0].left = t[1].left;
	    //         } else {
	    //             stack.push(new TreeNode[] {t[0].left, t[1].left});
	    //         }
	    //         if (t[0].right == null) {
	    //             t[0].right = t[1].right;
	    //         } else {
	    //             stack.push(new TreeNode[] {t[0].right, t[1].right});
	    //         }
	    //     }
	    //     return t1;
	    // }
	}
