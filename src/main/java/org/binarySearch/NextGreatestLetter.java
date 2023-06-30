package org.binarySearch;

public class NextGreatestLetter {
    public static char getNextLetter(char[] chars,char target){

        int start=0;
        int end=chars.length-1;
       while (start<=end){
           int mid = start + (end - start)/2;
           char midValue = chars[mid];
           //we ignore the target value
//           if (target==midValue){
//               return midValue;
//           }
           if (target<midValue){
               end = mid - 1;
           }else {
               start = mid + 1;
           }
       }
        return chars[start % chars.length];
    }

    public static void main(String[] args) {
        System.out.println(getNextLetter(new char[]{'a','b','c','d','z'},'z'));
    }
}
