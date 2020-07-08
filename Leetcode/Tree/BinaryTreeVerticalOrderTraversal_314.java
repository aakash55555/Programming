//package leetcode.Tree;
//import javafx.util.Pair;
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//
//public class BinaryTreeVerticalOrderTraversal_314 {
//	public List<List<Integer>> verticalOrder(TreeNode root){
//		List<List<Integer>> output = new ArrayList<>();
//		    if(root == null){
//		        return output;
//		    }
//		    //Pair (K key, V value) : Creates a new pair
//		Map<Integer, ArrayList> columnTable = new HashMap<>();
//		Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque();
//		 int column = 0;
//		 queue.add(new Pair(root, column));
//		 int minColumn = 0, maxColumn = 0;
//		 while(!queue.isEmpty()){
//		   Pair<TreeNode, Integer> pair = queue.poll();
//		   root = pair.getKey();
//		   column = pair.getValue();
//		     if(root != null){
//		   if(!columnTable.containsKey(column)){
//		   columnTable.put(column, new ArrayList<Integer>());
//		   }
//		    columnTable.get(column).add(root.val);
//		    minColumn = Math.min(minColumn, column);
//		    maxColumn = Math.max(maxColumn, column);
//		    queue.offer(new Pair(root.left, column - 1));
//		    queue.offer(new Pair(root.right, column + 1));     
//		   }  
//		 }   
//		for(int i = minColumn; i <= maxColumn; i++){
//		    output.add(columnTable.get(i));
//		}
//		return output;
//		} 
//}
