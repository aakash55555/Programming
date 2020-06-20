package leetcode.Array;
import java.util.*;
public class InsertDeleteGetRandom_380 {
	    private List<Integer> list;
	    private Map<Integer, Integer> map;
	    private Random random;
	    /** Initialize your data structure here. */
	    public InsertDeleteGetRandom_380() {
	        list = new ArrayList<>();
	        map = new HashMap<>();
	        random = new Random();
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if(map.containsKey(val))
	            return false;
	        map.put(val, list.size());
	        list.add(val);
	        return true;
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        Integer index = map.remove(val);
	        if(index == null)
	            return false;
	        if(index != list.size() - 1){
	        int element = list.get(list.size() - 1);
	        list.set(index, element);
	        map.put(element, index);
	        }
	        list.remove(list.size() - 1);
	        return true;
	        
	    }
}
