/*
 * C(n+1) = 2(2n+1) * C(n) /n+2
 * 
 */


package leetcode.Tree;
class UniqueBinarySearchTree_96 {
    public int numTrees(int n) {
        long C = 1;
        for(int i = 0; i < n; i++){
            C = 2 * C* (2*i + 1)/(i+2);
        }
        return (int)C;
    }
}