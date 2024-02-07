package Array_questions;

public class NumberThatAppearsOnce {
    public static void main(String[] args) {
        int [] arr = {2,2,1};
        System.out.println(OptimalSollution(arr));
    }

    //Brute Force sollution
    static int sollution(int []arr){
        int count = 0;
        int element = 0;
        for(int i =0;i< arr.length; i++){
            for(int j =0; j< arr.length; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
            }
            if(count == 0) element = arr[i];
            count = 0;
        }
        return element;
    }

    //Optimal Sollution
    static int OptimalSollution(int []arr){
        int value = 0;
        for(int i = 0; i< arr.length; i++){
            value = value ^ arr[i];
        }
        return value;
    }

}
