package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
            int [] arr = {5,2,0,7,9};

            bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selection(int []arr){
        for(int i= 0; i< arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void bubble(int [] arr){
        for(int i = arr.length-1; i >= 0; i--){
            for(int j = 0; j<= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static int getMax(int[] arr, int start, int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int [] arr, int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]= temp;
    }
}
