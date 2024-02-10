package Array_questions.Medium;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        int []arr = { 2,2,4,1,2}; // 1,2,1,3
        System.out.println(solution(arr,2));
    }

    static int solution(int []arr, long k) {
        int sum = 0;
        int start = 0;
        int ansStart;
        int end;
        int maxi = 0;

        for(int i =0; i<arr.length; i++){

            if(sum == 0){
                start = i;
            }

            sum+= arr[i];

            if(sum == k || arr[i] == k){
                ansStart = start;
                end = i;
                int currentMax = ansStart + (end - ansStart);
                if(currentMax > maxi){
                    maxi = currentMax;
                }
            }
            if(sum > k ) sum = 0;
        }
        return maxi;
    }
}
