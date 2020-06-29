package leetcode.LinkedList;

//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class ConvertSortedListToBinarySearchTree_109 {
	//Preorder traversal
    // ArrayList<Integer> list = new ArrayList<>();
    // public TreeNode sortedListToBST(ListNode head) {
    //     while(head != null){
    //         list.add(head.val);
    //         head= head.next;
    //     }
    //     TreeNode root = addNode(0, list.size() - 1);
    //     return root;
    // }
    // private TreeNode addNode(int start, int end){
    //     if(start > end){
    //         return null;
    //     }
    //     int mid = (start + end)/2;
    //     TreeNode root = new TreeNode(list.get(mid));
    //     root.left = addNode(start, mid - 1);
    //     root.right = addNode(mid+1, end);
    //     return root;
    // }
    
	//Inorder traversal
    public TreeNode sortedListToBST(ListNode head) {
        return Tree(head,null);
    }
    private TreeNode Tree(ListNode head, ListNode tail){
        if(head==tail)
            return null;
        ListNode slow = head, fast=head;
        while(fast!=tail && fast.next!=tail){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode left = Tree(head,slow);
        TreeNode root = new TreeNode(slow.val);
        TreeNode right = Tree(slow.next,tail);
        root.left = left;
        root.right = right;
        return root;
    }
}
