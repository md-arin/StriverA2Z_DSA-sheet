package Array_questions.Medium;

public class maximumSubarray {
    public static void main(String[] args) {
        int []arr = {-7 -8 -16 -4 -8 -5 -7 -11 -10 -12 -4 -6 -4 -16 -10 };
        System.out.println(solution(arr));
    }

    static int solution(int []nums){
        int sum = 0;
        int maximum = nums[0];
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            if(sum>maximum) maximum = sum;
            if(sum<0) sum = 0;
        }
        return  maximum;
    }
}

