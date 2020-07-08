package leetcode.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoundaryOfBinaryTree_545 {
	List<Integer> leftView = null;
	List<Integer> rightView  = null;
	List<Integer> leaves = null;

	public List<Integer> boundaryOfBinaryTree(TreeNode root) {
		
		if(root == null) return new ArrayList<Integer>();

		leftView = new ArrayList<Integer>();
		rightView = new ArrayList<Integer>();
		leaves = new ArrayList<Integer>();

		if(root.left != null) {
			leftView.add(root.val);
			getLeftView(root.left);
		}
		else {
			leftView.add(root.val);
		}

		getLeaves(root);

		if(root.right != null) {
			getRightView(root.right);
		}
		Collections.reverse(rightView);

		if(leftView.size() > 0 && leaves.size() > 0 && leftView.get(leftView.size() -1) == leaves.get(0)) {
			leaves.remove(0);
		}

		if(rightView.size() > 0 && leaves.size() > 0 && leaves.get(leaves.size() -1) == rightView.get(0)) {
			leaves.remove(leaves.size() -1);
		}

		leftView.addAll(leaves);
		leftView.addAll(rightView);
		return leftView;


	}

	private void getLeftView(TreeNode root) {

		if(root == null) return;

		leftView.add(root.val);
		if(root.left != null) {
			getLeftView(root.left);
		}
		else if(root.right != null) {
			getLeftView(root.right);
		}
	}

	private void getRightView(TreeNode root) {

		if(root == null) return;

		rightView.add(root.val);
		if(root.right != null) {
			getRightView(root.right);
		}
		else if(root.left != null) {
			getRightView(root.left);
		}
	}

	private void getLeaves(TreeNode root) {

		if(root == null) return;

		if(root.left == null && root.right ==  null) {
			leaves.add(root.val);
		}
		getLeaves(root.left);
		getLeaves(root.right);

	}
}
