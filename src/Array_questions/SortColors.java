package Array_questions;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int []arr = {4,3,8,2,1};
        sollution(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sollution(int []arr){
        int maxIndex = arr.length - 1;
        for (int i =0; i< arr.length; i++){
            if(arr[i]>arr[maxIndex]){
                swap(arr, i, maxIndex);
            } else if (arr[i]<arr[i-1]) {
                swap(arr, i,i-1);
            }
        }
    }

    static void swap(int []arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
