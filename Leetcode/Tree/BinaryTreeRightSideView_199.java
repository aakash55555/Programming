package leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView_199 {
	  List<Integer> list = new ArrayList<>();
	    public List<Integer> rightSideView(TreeNode root) {
	        if(root == null){
	            return list;
	        }
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        queue.add(null);
	        while(queue.size() > 1){
	            TreeNode node = queue.poll();
	            if(node.left != null){
	                queue.add(node.left);
	            }
	            if(node.right != null){
	                queue.add(node.right);
	            }
	            if(queue.peek() == null){
	               list.add(node.val);
	               queue.add(queue.poll()); 
	            }
	        }
	        return list;
	    }
}
