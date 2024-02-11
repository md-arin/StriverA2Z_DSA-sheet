package Array_questions.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElements {

    public static void main(String[] args) {
        int []arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(optimalSolution(arr)));
    }

    //Unoptimized way taking O(n/2)
    static int [] solution(int []arr){
        int n = arr.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        //positive on even indices and negative on odds
        for(int i =0; i<n/2; i++){
            arr[2 *i] = pos.get(i);
            arr[2*i + 1] = neg.get(i);
        }

        return  arr;
    }

    static int [] optimalSolution(int [] arr){
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > 0){
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }
}
