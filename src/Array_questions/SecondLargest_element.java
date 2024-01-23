package Array_questions;

import java.sql.Array;
import java.util.Arrays;

public class SecondLargest_element {
    public static void main(String[] args) {

        int [] arr = {3,6,2,9,1,7};
        int n = arr.length;
        int sLargest = secondLargest(arr,n);
        int sSmallest = secondSmallest(arr,n);
        System.out.println("Second largest and second smallest values are: " + sLargest +","+  sSmallest);
    }

    static int  secondLargest(int[]arr, int n){
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }

        }
        return slargest;
    }

    static int secondSmallest(int[] arr, int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] != smallest && arr[i]<ssmallest) {
                ssmallest = arr[i];
            }
        }
        return  ssmallest;
    }
}
