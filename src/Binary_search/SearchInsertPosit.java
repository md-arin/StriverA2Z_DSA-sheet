package Binary_search;

public class SearchInsertPosit {
    public static void main(String[] args) {
        int []arr = {1,3,5,6};
        System.out.println(solution(arr,5));
    }

    static int solution(int []nums, int target){
        int s = 0;
        int e = nums.length - 1;
        int ans = nums.length;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] >= target){
                ans = mid;
                e= mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
}
