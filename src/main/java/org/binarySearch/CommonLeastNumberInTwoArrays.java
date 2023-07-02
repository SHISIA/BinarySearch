package org.binarySearch;

public class CommonLeastNumberInTwoArrays {
    public static int commonNumber(int[] nums1,int[] nums2){
        int workingLength = Math.max(nums1.length, nums2.length);
        for(int i=0;i<workingLength;i++){
            for(int j=0;j<workingLength;j++){
                System.out.println("Iiii "+i+" Jjjjjj "+j);
                if(nums1[i]==nums2[j]){
                    return nums1[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(commonNumber(new int[]{2,4},new int[]{1,2}));
    }
}
