package Array_questions.Medium;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        int []arr = {1,2,1,3};
        System.out.println(solution(arr,5));
    }

    static int solution(int []arr, long k) {
        int sum = 0;
        int start = 0;
        int ansStart;
        int end;
        int maxi = 0;
        for(int i =0; i< arr.length; i++ ){

            if(sum == 0){
                start = i;
            }

            sum += arr[i];

            if(sum > k) sum = 0;

            if(sum == k){
                ansStart = start;
                end = i;
                int cureentSubArray = (end - ansStart) + 1;
                if(cureentSubArray > maxi){
                    maxi = cureentSubArray;
                }
                sum = 0;
            }
        }
        return maxi;
    }
}
