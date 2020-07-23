package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class subsets_78 {
	
	//A Solution
		 List<List<Integer>> res = null;

			public List<List<Integer>> subsets(int[] nums) {
				res = new ArrayList<List<Integer>>();
				subsets(0,nums,new ArrayList<Integer>());
				return res;
			}

			public void subsets(int pos, int[] nums, List<Integer> temp) {

				res.add(new ArrayList<>(temp));
		        for(List<Integer> result : res){
		            System.out.println();
		            for(Integer list : result){
		                System.out.print(list);
		            }
		        }

				for(int i=pos; i<nums.length; i++) {
					temp.add(nums[i]);
					subsets(i+1, nums, temp);
					temp.remove(temp.size()-1);
				}
			}
			// Solution2
//			  List<List<Integer>> output = new ArrayList();
//			  int n, k;
//
//			  public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
//			    if (curr.size() == k)
//			      output.add(new ArrayList(curr));
//
//			    for (int i = first; i < n; ++i) {
//			      curr.add(nums[i]);
//			      backtrack(i + 1, curr, nums);
//			      curr.remove(curr.size() - 1);
//			    }
//			  }
//
//			  public List<List<Integer>> subsets(int[] nums) {
//			    n = nums.length;
//			    for (k = 0; k < n + 1; ++k) {
//			      backtrack(0, new ArrayList<Integer>(), nums);
//			    }
//			    return output;
//			  }			
}



