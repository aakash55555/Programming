package leetcode.Array;

import java.util.Arrays;

//public class MergeSortedArray_88 {
//	 public void merge(int[] nums1, int m, int[] nums2, int n) {
//		 int j = 0;
//		 for(int i = m; i < (m+n) ; i++) {
//			 nums1[i] = nums2[j];
//			 j++;
//		 }
//		 Arrays.sort(nums1);
//		 for(int i = 0; i < nums1.length; i++) {
//			 System.out.print(nums1[i]+ " ");
//		 }
//	 }
//	public static void main(String[] args) {
//		MergeSortedArray_88 mergeArray = new MergeSortedArray_88();
//		int[] nums1 = {1,2,3,4,5,6,0,0,0,0,0,0};
//		int[] nums2 = {1,2,3,4,5,6};
//		mergeArray.merge(nums1, 6, nums2, nums2.length);
//	}
//}

public class MergeSortedArray_88 {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 int p1 = 0, p2=0, p3= 0;
		 int[] nums3 = new int[m];
		 System.arraycopy(nums1, 0, nums3, 0, m);
		 while(p2 < m && p3 < n) {			 
			 nums1[p1++] = (nums3[p2] > nums2[p3]) ? nums2[p3++]: nums3[p2++] ;
		 }
		 while(p2 < m) {
			 nums1[p1++] = nums3[p2++];
		 }
		 while(p3 < n) {
			 nums1[p1++] = nums2[p3++];
		 }
		 for(int i = 0; i < nums1.length; i++) {
			 System.out.print(nums1[i]+ " ");
		 }
	 }
	public static void main(String[] args) {
		MergeSortedArray_88 mergeArray = new MergeSortedArray_88();
		int[] nums1 = {1,2,3,4,5,6,0,0,0,0,0,0};
		int[] nums2 = {1,2,3,4,5,6};
		mergeArray.merge(nums1, 6, nums2, nums2.length);
	}
}