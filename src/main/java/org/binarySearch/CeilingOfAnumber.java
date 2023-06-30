package org.binarySearch;

/**if you are given a sorted array, use binary Search
 * Ceiling of a givne number is
 * ::SMALLEST ELEMENT IN THE ARRAY GREATER OR EQUAL TO THE GIVEN TARGET NUMBER
 * **/

public class CeilingOfAnumber {
    public static int getCeil(int[] nums,int target){
        if (target>=nums[nums.length-1]){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end= mid -1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(getCeil(new int[]{1,3,4,5,6,9,10,19,23},27));
    }
}
