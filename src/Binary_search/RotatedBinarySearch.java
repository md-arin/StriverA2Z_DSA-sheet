package Binary_search;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int []arr = {4,5,6,7,0,1,2};
        System.out.println(RBS(arr, 0));
    }


    static int RBS(int[] nums, int target){
        int s= 0;
        int e = nums.length -1;
        while (s <= e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target) return mid;

            if(nums[s] <= nums[mid]){
                if(nums[s] <= target && target <= nums[mid]){
                    e = mid - 1;
                } else{
                    s = mid + 1;
                }
            } else{
                if(nums[mid] <= target && target <= nums[e]){
                    s = mid + 1;
                } else{
                    e = mid -1;
                }
            }
        }
        return -1;
    }
}
