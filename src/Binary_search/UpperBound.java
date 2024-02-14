package Binary_search;

public class UpperBound {
    public static void main(String[] args) {
        int []arr = {1,4,7,8,10};
        System.out.println(upperBound(arr,7,arr.length));
    }

    static int upperBound(int[]arr, int x, int n){
        int s = 0;
        int e = n-1;
        int ans = n;
        while (s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] > x){
                ans = mid;

                e = mid -1;
            } else{
                s = mid+1;
            }
        }
        return ans;
    }

}
