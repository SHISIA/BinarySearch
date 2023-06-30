package org.binarySearch;

/**floor of a number refers to the lower or equal to the number
 * Ins short, for a sorted array, just use binary search, and instead of returning a -1 when element is not found, return
 * the end element**/
public class FloorOfANumber {
    public static int getFloor(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid = start + (end -start)/2;
            if (target<nums[mid]){
                end = mid - 1;
            }else {
                start = mid +1 ;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(getFloor(new int[]{0,2,3,4,6,8,9,10,15,56},7));
    }
}
