package Binary_search;

public class ArrayRotation {
    public static void main(String[] args) {
        int []arr = {3, 4, 5, 1, 2};
        System.out.println(sollution(arr));
    }

    static int sollution(int []arr){
        int ans = Integer.MAX_VALUE;
        int index = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            if(arr[low]<= arr[mid]){
                if(arr[low] < ans){
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else{
                if(arr[mid]<ans){
                    ans = arr[mid];
                    index = mid;
                }
                high = mid -1;
            }
        }
        return  index;
    }
}
