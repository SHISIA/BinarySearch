package org.binarySearch;

public class PivotPointOnRotatedArray {
    public static int pivotPoint(int[] nums,int target){
        int pivot = getPivot(nums);
        if(pivot!=-1){
            int firstRound =binarySearch(nums,pivot+1,nums.length-1,target);
            if (firstRound==-1){
                return binarySearch(nums,0,pivot,target);
            }
            return firstRound;
        }
        return -1;
    }

    static int getPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
           if (nums[mid]>nums[mid+1] && mid < end){
               return mid;
           }
           if (mid > start && nums[mid]<nums[mid-1]){
               return mid - 1;
           }
           if (nums[mid]>=nums[start]){
               start=mid + 1;
           }else {
               end= mid - 1 ;
           }
        }
        return -1;
    }

    static int binarySearch(int[] nums,int start,int end, int target){
        while (start<=end){
            int mid=start+(end - start)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotPoint(new int[]{-2,-1,-1,1,2,3},19));
    }

}
