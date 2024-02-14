package Binary_search;

public class binarySearch {
    public static void main(String[] args) {
        int []arr = {-1,0,3,5,9,12};
        System.out.println(search(arr,9));
    }

    static int search (int[]nums, int target){
        int s = 0;
        int e = nums.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(target > nums[mid]){
                s = mid+1;
            } else{
                e = mid -1;
            }
            if(target == nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}
