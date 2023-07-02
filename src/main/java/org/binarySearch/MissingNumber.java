package org.binarySearch;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        //arithmetic progression formula
        int n = nums.length*(nums.length + 1)/2;
        for(int i=0;i<nums.length;i++){
            n-=i;
        }
        return n;
    }
}
