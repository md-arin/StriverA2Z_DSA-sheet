package Array_questions;

// https://leetcode.com/problems/max-consecutive-ones/submissions/1167787673/

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int []a = {1,1,0,1,1,0,0,1,1,1,1,1};
        System.out.println(sollution(a));
    }


    static int sollution(int []a){
        int count = 0;
        int maxCount = 0;
        for(int i =0; i < a.length ; i++){
            if(a[i] == 1){
                count++;
                maxCount = Math.max(count,maxCount);
            } else {

                count = 0;

            }

        }
        return maxCount;
    }
}
