package leetcode.Tree;

public class ConvertSortedArrayToBinarySearchTree_108 {
	
	//DFS solution
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
      return traverseTree(nums, 0, nums.length -1);  
    }
    private TreeNode traverseTree(int[] nums, int first, int last){
        if(first > last){
            return null;
        }
        int mid = (first + last )/2;
        TreeNode middle = new TreeNode(nums[mid]);
        middle.left = traverseTree(nums, first, mid -1);
        middle.right = traverseTree(nums, mid+1, last);
        return middle;
        
    }

}
