package Array_questions.Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class nextPermutations {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); // size of the array.
        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }

    static void permutation(int []nums){
        int n = nums.length;
        if(n < 2) return;

        //Step 1: find elements to replace
        int cur = n - 2, pre = n - 1;
        while(0 <= cur){
            if(nums[cur] < nums[pre]) break;
            cur--;
            pre--;
        }
        if(0 <= cur){
            int replaceIndex = n - 1;
            while(0 < replaceIndex){
                if(nums[cur] < nums[replaceIndex]) break;
                replaceIndex--;
            }
            swap(nums, replaceIndex, cur);
        }
        reverse(nums, pre, n - 1);
    }
    static void swap(int[] nums, int i1, int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
    static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}
