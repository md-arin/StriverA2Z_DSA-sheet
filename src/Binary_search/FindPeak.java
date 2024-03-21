package Binary_search;

public class FindPeak {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,6,4};
        System.out.println(sollution(arr));
    }

    static int sollution (int[] nums){
        int s = 0;
        int e = nums.length -1;
        while (s < e){
            int m = s + (e-s)/2;
            if(nums[m] > nums[m + 1]){
                e = m;
            } else{
                s = m + 1;
            }
        }
        return s;
    }
}
