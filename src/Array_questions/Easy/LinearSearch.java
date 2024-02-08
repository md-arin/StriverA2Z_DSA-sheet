package Array_questions.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1,5,32,6,23,5};
        int n = arr.length;
        int nums = 6;
        System.out.println(Ls(arr,n,nums));
    }

    static int Ls(int []arr, int n, int nums){
        for(int i =0; i<n; i++){
            if(arr[i] == nums){
                return  i;
            }
        }
        return -1;
    }
}
