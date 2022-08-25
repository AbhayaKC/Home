package com.infosys;

public class MountainPeek {
    public static void main(String[] args) {
    int [] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {

        //  3451
        int mid = (arr.length-1)/2;
        int start = mid -1;
        int end = mid +1;
        while(arr[mid] > arr[start] && arr[mid] > arr[end]){
            if (arr[mid] > arr[start] && arr[mid] > arr[end]){
                return mid;
            }
            if(arr[mid] < arr[end]){
                mid ++;
                start++;
                end++  ;
            }else{
                mid--;
                start--;
                end--;

            }

        }
        return mid+1;
    }
}
