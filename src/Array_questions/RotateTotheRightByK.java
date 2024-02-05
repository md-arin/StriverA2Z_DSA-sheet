package Array_questions;

import java.sql.Array;
import java.util.Arrays;

public class RotateTotheRightByK {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
//        System.out.println(Arrays.toString(sollution(arr,k)));
      optimalSolllution(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    //Brute Force
    static int [] sollution (int []arr, int k){
        int j = arr.length - k;
        int i = 0;
        int l = 0;
        int [] temp = new int[arr.length];
        while(j < arr.length){
            temp[i] = arr[j];
            j++;
            i++;
        }

        while (i< arr.length){
            temp[i] = arr[l];
            i++;
            l++;
        }
    return temp;
    }

    //Optimal Sollution
    static void optimalSolllution(int [] arr, int k){

        k = k % arr.length;
        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr, k,n-1);

    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}
