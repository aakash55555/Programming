package leetcode.Array;
import java.util.*;

public class ContainsDuplicate_217 {
  public boolean containsDuplicate(int[] nums) {
      if(nums.length == 0)
          return false;
      Arrays.sort(nums);
      for(int i = 0; i< nums.length - 1; i++){
          if(nums[i] == nums[i+1])
              return true;
      }
      return false;
  }
	public static void main(String[] args) {
		ContainsDuplicate_217 duplicates = new ContainsDuplicate_217();
		int[] arr = {1,2,3};
		boolean val = duplicates.containsDuplicate(arr);
		System.out.print(val);
	}
}


//public class ContainsDuplicate_217 {
// public boolean containsDuplicate(int[] nums) {
//     if(nums.length == 0)
//         return false;
//     Arrays.sort(nums);
//     int p1 = 0, p2 = 1;
//     while(p1 < nums.length && p2 < nums.length){
//         if(nums[p1] == nums[p2])
//             return true;
//         else{
//             p1++;
//             p2++;
//         }
//     }
//     return false;
// }
//	public static void main(String[] args) {
//		ContainsDuplicate_217 duplicates = new ContainsDuplicate_217();
//		int[] arr = {1,2,3};
//		boolean val = duplicates.containsDuplicate(arr);
//		System.out.print(val);
//	}
//}

