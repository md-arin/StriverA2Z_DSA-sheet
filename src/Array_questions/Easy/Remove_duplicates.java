package Array_questions.Easy;

import java.util.HashSet;

public class Remove_duplicates {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4,5};
        System.out.println(removeDuplictes(nums));
    }

   //Optimal sollution BF sollution is using Hashset
    static int  removeDuplictes(int [] nums){
        int i = 0;
        for(int j = 0;j< nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return  i + 1;
    }

    //Brute force sollution
    static int removeDuplicates2(int [] nums){
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            nums[j++] = x;
        }
        return k;
    }
}
