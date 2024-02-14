package Binary_search;

import java.util.Arrays;

public class FloorandCeil {
    public static void main(String[] args) {
        int []arr = {3,4,4,7,8,10};
        System.out.println(Arrays.toString(getFloorandCeil(arr,arr.length,8)));
    }

    static int[] getFloorandCeil(int[]a, int n, int x){

        int floor = getFloor(a,n,x);
        int ceil = getCeil(a,n,x);

        return new int[]{floor,ceil};

    }

    static int getFloor(int[]a, int n, int x){
        int s = 0;
        int e = n-1;
        int floor = -1;
        while (s <= e){
            int mid = s + (e-s)/2;

            if(a[mid] <= x){
                floor = a[mid];
                s = mid + 1;
            } else{
                e = mid -1;
            }

        }
        return floor;
    }

    static int getCeil(int[]a, int n, int x){
        int s = 0;
        int e = n-1;
        int ceil = -1;
        while (s <= e){
            int mid = s + (e-s)/2;

            if(a[mid] >= x){
                ceil = a[mid];
                e = mid - 1;
            } else{
                s = mid + 1;
            }

        }
        return ceil;
    }
}
