package Basic_recursion;

import java.util.Arrays;

public class oneToNwithoutLoop {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(print(4)));
    }

    static int [] print(int x){
        int []arr = new int[x];
        int count = 0;
        helper(arr,x,count);
        return arr;
    }

    static void helper(int arr[], int x,int count){
        if(count==x){
            return;
        }
        arr[count]=count+1;
        helper(arr,x,count+1);
    }
}
