package Binary_search;

public class findMinimuminRBS {
    public static void main(String[] args) {
        int []arr = {3,4,5,1,2};
        System.out.println(solution(arr));
    }

    static int solution(int []nums){
        int s =0;
        int e = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[s] <= nums[mid]){
                ans = Math.min(ans,nums[s]);
                s = mid + 1;
            } else{
                ans = Math.min(ans,nums[mid]);
                e = mid -1;
            }
        }
        return ans;
    }
}
