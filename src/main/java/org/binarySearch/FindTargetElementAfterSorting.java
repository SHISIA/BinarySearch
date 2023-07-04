package org.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**LeetCode Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/**/
public class FindTargetElementAfterSorting {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< nums.length-1;i++){
            if (nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}
