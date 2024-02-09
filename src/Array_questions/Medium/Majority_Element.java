package Array_questions.Medium;

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int [] arr = {3,2,3,1,5,1,6,1,1};
        System.out.println(sollution(arr));
    }

    //Brute force sollution
    static int  sollution(int [] arr){
        int count = 0;
        int [] maxElement = {0,0};
        for(int i =0; i< arr.length; i++){
            for(int j =0; j< arr.length; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
            }
            if(count > maxElement[1]){
                maxElement[1] = count;
                maxElement[0] = arr[i];
            }
            count =0;
        }
        return maxElement[0];
    }

    //Optimal soluton: Moore's voting algorithm

    static int majorityElement(int []arr){
        int count = 0;
        int elm = 0;

        for(int i =0; i< arr.length;i++){
            if(count == 0){
                count = 1;
                elm = arr[i];
            } else if (elm == arr[i]) {
                count++;
            }
            else count --;
        }

        int count1 = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]  == elm) count1++;
        }
        if(count1 > (arr.length/2)){
            return elm;
        }
        return -1;
    }

}
