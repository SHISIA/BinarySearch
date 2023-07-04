package org.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;

/**Problem Link: https://leetcode.com/problems/intersection-of-two-arrays-ii
 * **/
public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> list=new ArrayList<>();
//        int[] array=new int[m];

        for(int i=0;i<n;i++){
            // int numsI=nums1[i];
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    System.out.println(nums1[i]);
                }
            }
        }
        int[] output = new int[list.size()];
        int k=0;
        for(int i:list){
            output[k++]=i;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
