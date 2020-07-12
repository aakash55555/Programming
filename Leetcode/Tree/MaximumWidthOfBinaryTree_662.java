package leetcode.Tree;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumWidthOfBinaryTree_662 {
	 public int widthOfBinaryTree(TreeNode root) {
	        if (root == null)
	            return 0;

	        // queue of elements [(node, col_index)]
	        Deque<TreeNode> queue = new LinkedList<>();
	        Integer maxWidth = 0;
	        queue.add(root);
	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            maxWidth = Math.max(maxWidth, size);
	            for (int i = 0; i < size; ++i) {
	                TreeNode node = queue.poll();
	                if(node == null){
	                    queue.add(null);
	                    queue.add(null);
	                }
	                else{
	                    queue.add(node.left);
	                    queue.add(node.right);
	                }
	            }
	        while(!queue.isEmpty() && queue.peekFirst() == null){
	            queue.pollFirst();
	        }
	        while(!queue.isEmpty() && queue.peekLast() == null){
	            queue.pollLast();
	            }
	        }
	        return maxWidth;
	    }
}
