package leetcode.Array;

public class ReverseBits_190 {
    //O(32) time complexity and O(1) space complexity 
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
    for(int i = 0; i<32; i++){
        rev = rev << 1;//creating a space of 1 in reverse
        rev = rev | (n & 1);// (n & 1 will give the last bit)
        // | operator will help in entering the last bit into rev
        n = n >> 1;// delete the last bit
    }    
        return rev;
    }
}
