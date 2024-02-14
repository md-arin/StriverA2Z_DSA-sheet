package Array_questions.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2,0},
                {1,2,4,0},
                {1,3,1,5},
        };
        setZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void setZeros(int[][] matrix) {
        boolean firstRow = false, firstCol = false;

        // Set markers in first row and first column
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] == 0) {
                    if (i == 0) firstRow = true;
                    if (j == 0) firstCol = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }

        // Replace inner matrix
        for (int i = 1; i < matrix.length; i++)
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        // Last remaining checks
        if (firstRow)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[0][j] = 0;

        if (firstCol)
            for (int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
    }

}
