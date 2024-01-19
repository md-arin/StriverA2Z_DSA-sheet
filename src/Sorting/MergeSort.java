package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {34,23,65,3,654,23,6,15};
        mergeSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int lo, int hi ){
        if(lo >= hi){
            return;
        }
        int mid = (lo + hi)/2;
        mergeSort(arr,lo,mid);
        mergeSort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);
    }

     static void merge(int[] arr, int lo, int mid, int hi){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = lo;
        int right = mid+1;

        // Checking and merging all the elements
        while(left <= mid && right <= hi){
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else{
                temp.add(arr[right]);
                right++;
            }
        }
        // if left array elements still remains
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        // if right array elements still remains
        while(right <= hi){
            temp.add(arr[right]);
            right++;
        }

        // Modifying the origianl array
        for(int i = lo; i <= hi; i++){
            arr[i] = temp.get(i-lo);
        }
    }
}
