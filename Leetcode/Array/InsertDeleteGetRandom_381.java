package leetcode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandom_381 {
	  Map<Integer, Set<Integer>> map;
	    List<Integer> list;
	    Random random;
	    /** Initialize your data structure here. */
	    public InsertDeleteGetRandom_381() {
	    random = new Random();
	    list = new ArrayList();
	    map = new HashMap<>();    
	    }
	    
	    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
	    public boolean insert(int val) {
	    boolean contains = map.containsKey(val); 
	    if(!contains){
	        map.put(val, new HashSet<Integer>());
	    }    
	        map.put(val, new HashSet<Integer>());
	        map.get(val).add(list.size());
	        list.add(val);
	        return !contains;
	    }
	    
	    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
	    public boolean remove(int val) {
	       Set<Integer> index = map.remove(val);
	        if(index == null){
	            return false;
	        }
	        for(Integer in : index){
	            if(in != list.size() - 1){
	                int element = list.get(list.size()-1);
	                list.set(in, element);
	                map.get(element).add(in);
	            }
	            System.out.println("Value removed = "+list.remove(list.size()-1));
	            list.remove(list.size()-1);
	        }
	        return true;
	    }
	    
	    /** Get a random element from the collection. */
	    public int getRandom() {
	       return list.get(random.nextInt(list.size()));
	    }
	    
	    public static void main(String[] args) {
	    	InsertDeleteGetRandom_381 ins = new InsertDeleteGetRandom_381();
	    	ins.insert(5);
	    	ins.insert(5);
	    	ins.insert(10);
	    	ins.remove(5);
	    	ins.getRandom();
	    	ins.remove(10);
	    	ins.getRandom();
	    	ins.getRandom();
	    }
}
