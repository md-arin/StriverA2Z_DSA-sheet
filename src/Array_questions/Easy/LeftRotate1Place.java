package Array_questions.Easy;

import java.util.Arrays;

public class LeftRotate1Place {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(Arrays.toString(sollution(arr,n)));
    }
    static int [] sollution (int []arr, int n){
        int temp = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return  arr;
    }
}
