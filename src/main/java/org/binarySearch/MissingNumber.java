package org.binarySearch;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
//        https://leetcode.com/problems/missing-number
        //arithmetic progression formula
        int n = nums.length*(nums.length + 1)/2;
        int sum=0;
        System.out.println("n "+n);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return n-sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
