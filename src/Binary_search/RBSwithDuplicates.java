package Binary_search;

public class RBSwithDuplicates {
    public static void main(String[] args) {
        int []arr = {2,5,6,0,0,1,2};
        System.out.println(solution(arr,3));
    }

    static boolean solution(int []nums, int target){
        int s =0;
        int e = nums.length -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[s] == nums[mid] && nums[mid] == nums[e]){
                s = s + 1;
                e = e -1;
                continue;
            }


            if(nums[mid]>=nums[s]){
                if(nums[s] <= target && target <= nums[mid]){
                    e = mid - 1;
                } else{
                    s = mid + 1;
                }
            }
            else{
                if(nums[mid] <= target && target <= nums[e]){
                    s = mid + 1;
                } else{
                    e = mid -1;
                }
            }
        }
        return false;
    }
}
