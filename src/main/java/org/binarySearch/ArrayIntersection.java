package org.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/**Problem Link: https://leetcode.com/problems/intersection-of-two-arrays-ii
 * **/
public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
//        int[] array=new int[m];
//        Set<Integer>
//        for(int i=0;i<n;i++){
//            // int numsI=nums1[i];
//            for(int j=0;j<m;j++){
//                if(nums1[i]==nums2[j]){
//                    list.add(nums1[i]);
//                    System.out.println(nums1[i]);
//                }
//            }
//        }
        int i=0,j=0;
        while (i<n && j<m){
            //if nums1[i] element is less than nums2[j] , move to the next greater nums1 element
            if (nums1[i] <nums2[j]){
                i++;
            }
            //if nums1[i] element is more/greater than nums2[j] , move to the next greater nums2 element
            else if (nums1[i]>nums2[j]) {
                j++;
            }
            //now they are equal , so we save them to our arraylist, then increment the values
            else {
                list.add(nums1[i]);
                j++;
                i++;
            }
        }
        int[] output = new int[list.size()];
        int k=0;
        while(k < list.size()){
            output[k] = list.get(k);
            k++;
        }
        return output;
    }

    // Runtime: 1 ms, faster than 99.13% of Java online submissions for Intersection of Two Arrays II.
// Memory Usage: 42.5 MB, less than 92.71% of Java online submissions for Intersection of Two Arrays II.
        public static int[] intersection(int[] nums1, int[] nums2) {
            // Sort both the arrays first...
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            // Create an array list...
            ArrayList<Integer> arr = new ArrayList<>();
            // Use two pointers i and j for the two arrays and initialize both with zero.
            int i = 0, j = 0;
            while(i < nums1.length && j < nums2.length){
                // If nums1[i] is less than nums2[j]...
                // Leave the smaller element and go to next(greater) element in nums1...
                if(nums1[i] < nums2[j]) {
                    i++;
                }
                // If nums1[i] is greater than nums2[j]...
                // Go to next(greater) element in nums2 array...
                else if(nums1[i] > nums2[j]){
                    j++;
                }
                // If both the elements intersected...
                // Add this element to arr & increment both i and j.
                else{
                    arr.add(nums1[i]);
                    i++;
                    j++;
                }
            }
            // Create a output list to store the output...
            int[] output = new int[arr.size()];
            int k = 0;
            while(k < arr.size()){
                output[k] = arr.get(k);
                k++;
            }
            return output;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
