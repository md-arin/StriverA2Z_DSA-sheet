package Binary_search;

import java.util.Arrays;

public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 10, 10, 10, 11, 12, 14, 14, 17, 19, 19};
        System.out.println(solution(arr, arr.length, 10));
    }

    static int solution(int arr[], int n, int x) {

        int first = search(arr, x, true);
        int last = search(arr, x,false);
       if(first == 0){
           return last - first;
       }
       return (last -first) + 1;

    }

    static int search(int[] nums, int target, boolean findFirst) {
        int s = 0;
        int ans = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > target) {
                e = mid - 1;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                ans = mid;
                if (!findFirst) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return ans;
    }
}
