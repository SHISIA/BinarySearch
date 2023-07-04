package org.binarySearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDifference {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> intList1=new HashSet<>();
        Set<Integer> intList2=new HashSet<>();
        List<List<Integer>> finalList= new ArrayList<>();
        for(int i:nums2){
            intList1.add(i);
        }
        for(int j:nums1){
            intList2.add(j);
        }
        for(int k:intList1){
            if(intList2.contains(k)){
                intList2.remove(k);
            }
        }
        for(int k:intList2){
            if(intList1.contains(k)){
                intList1.remove(k);
            }
        }

        finalList.add(new ArrayList<>(intList2));
        finalList.add(new ArrayList<>(intList1));

        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }
}
