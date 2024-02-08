package Array_questions.Easy;

public class Missing_Number {
    public static void main(String[] args) {
        int []a = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(a));
    }

   static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if( nums[i]<nums.length && nums[i]!= nums[nums[i]]){
                swap(nums, i, nums[i]);
            }else{
                i++;
            }
        }

        for (int index=0;index< nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
}

