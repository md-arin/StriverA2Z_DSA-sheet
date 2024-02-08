package Array_questions.Easy;

import java.util.Arrays;

public class MoveZeroToTheEnd {
    public static void main(String[] args) {
        int [] arr = {4,0,3,2,5};
        int n = arr.length;
        sollution(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void sollution(int []arr, int n){
      int count = 0;
      for(int i =0; i< arr.length; i++){
          if(arr[i] != 0){
              arr[count++] = arr[i];
          }
      }

      while (count<arr.length){
          arr[count++] = 0;
      }
    }
}
