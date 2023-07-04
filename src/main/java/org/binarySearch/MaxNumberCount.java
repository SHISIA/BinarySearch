package org.binarySearch;

class MaxNumberCount {
    public static int maximumCount(int[] nums) {

        if(!(nums[0]<0)){
            return nums.length;
        }
        return getMid(nums);

    }

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-1563,-236,-114,-55,0,427,447,687,752,1021,1636}));
    }

    public static int getMid(int[] nums){
        int start=0;
        int end=nums.length;
        int negCount=0,posCount=0;
        while(start<=end){
            if(nums[negCount]<0){
                negCount++;
            }else  {
                posCount++;
            }
            start++;
        }
        int zero=end - (posCount+negCount);
        return Math.max(posCount-zero, negCount);
    }
}
