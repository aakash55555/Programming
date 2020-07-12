package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph_133 {
	   public Node cloneGraph(Node node) {
	        if(node == null){
	            return node;
	        }
	        Map<Integer, Node> map = new HashMap<>();
	        Set<Integer> visited = new HashSet<>();
	        Queue<Node> queue = new LinkedList<>();
	        
	        queue.add(node);
	        
	        while(!queue.isEmpty()){
	        Node current = queue.poll();
	        visited.add(current.val);
	        Node curr_copy = map.getOrDefault(current.val, new Node());
	        curr_copy.val = current.val;
	        map.put(current.val, curr_copy);  
	            
	        List<Node> neighbors = current.neighbors;
	        
	        for(Node neighbor : neighbors){
	        
	            if(!visited.contains(neighbor.val)){
	        
	        Node neighborCopy = map.getOrDefault(neighbor.val, new Node());
	        neighborCopy.val = neighbor.val;
	        curr_copy.neighbors.add(neighborCopy);
	        neighborCopy.neighbors.add(curr_copy);
	        map.put(neighbor.val, neighborCopy);
	        queue.add(neighbor);    
	             }
	            }    
	        }
	        return map.get(node.val);
	    }
}
