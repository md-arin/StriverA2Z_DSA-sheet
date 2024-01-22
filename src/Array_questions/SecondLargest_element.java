package Array_questions;

import java.sql.Array;
import java.util.Arrays;

public class SecondLargest_element {
    public static void main(String[] args) {

        int [] arr = {3,6,2,9,1,7};
        int []ans = getSecondOrderElements(arr.length,arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        sort(a, n);
        int secondLargestelement = a[n-1-1];
        int secondSmallest = a[1];
        int []ans = {secondLargestelement,secondSmallest};
        return ans;
    }

    static void sort(int []arr,int size){

        for(int i = 0; i <= size -1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] =  temp;
                j--;
            }
        }
    }
}
