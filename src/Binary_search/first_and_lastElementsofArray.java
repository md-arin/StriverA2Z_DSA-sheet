package Binary_search;

import java.util.ArrayList;
import java.util.Arrays;

public class first_and_lastElementsofArray {
    public static void main(String[] args) {
        int []arr = {2,4,10,10,10,10,10,10,11,12,14,14,17,19,19};
        System.out.println(Arrays.toString(solution(arr,10)));
    }

    static int []solution(int[]nums, int target){

        int first = search(nums, target, true);
        int last = search(nums, target,false);
        return new int[]{first,last};
    }

    static int search(int []nums, int target, boolean findFirst){
        int s = 0;
        int ans = -1;
        int e = nums.length -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] > target){
                e = mid -1;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else{
                ans = mid;
                if(!findFirst){
                    s = mid + 1;
                } else{
                    e = mid -1;
                }
            }
        }
        return ans;
    }

    static int search(ArrayList<Integer> arr, int k, boolean findFirst){
        int ans = -1;
        int s = 0;
        int e = arr.size() - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr.get(mid) > k){
                e = mid - 1;
            } else if(arr.get(mid) < k){
                s = mid + 1;
            } else{
                ans = mid;
                if(!findFirst){
                    s = mid + 1;
                } else{
                    e = mid - 1;
                }
            }
        }
        return ans;
    }
}
