package org.binarySearch;

import java.util.Arrays;

class FirstAndLastPosition{
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int min=search(nums,target,true);
        if(min!=-1){
            ans[0]=min;
            ans[1]=search(nums,target,false);
        }
        return ans;
    }

    static int search(int[] nums,int target,boolean minPosition){
        int start=0;
        int ans=-1;
        int end = nums.length -1 ;
        while(start<=end){
            int mid=start + (end - start)/2;
            int midValue = nums[mid];
            if(target > midValue){
                start = mid +1;
            }else if(target < midValue){
                end = mid - 1;
            }else{
                ans = mid;
                if (minPosition){
                    end = mid - 1;
                }else
                    start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7,7,7,8, 8, 10}, 8)));
    }
}
