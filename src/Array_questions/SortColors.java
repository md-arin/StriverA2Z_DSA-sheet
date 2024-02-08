package Array_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 0, 0, 1, 2};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    // BruteForce sollution
    static void sollution(int[] arr) {
        int countOfZero = 0;
        int countOfOne = 0;
        int countOfTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countOfZero++;
            }
            if (arr[i] == 1) {
                countOfOne++;
            }
            if (arr[i] == 2) {
                countOfTwo++;
            }
        }

        for (int i = 0; i < countOfZero; i++) {
            arr[i] = 0;
        }
        for (int i = countOfZero; i < countOfOne + countOfZero; i++) {
            arr[i] = 1;
        }
        for (int i = countOfOne + countOfZero; i < countOfTwo + countOfOne + countOfZero; i++) {
            arr[i] = 2;
        }
    }

    //Optinal sollution
    static void sortArray(int []arr) {
        int n = arr.length; // assuming you have 'n' defined somewhere

        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
}
