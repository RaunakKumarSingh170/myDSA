package Array.Matrix;

import java.util.ArrayList;
import java.util.List;

public class PrintSumOfRowsOfMatrix {

    public List<Integer> rowSum(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            if (arr[i] != null) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            }
            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {
        PrintSumOfRowsOfMatrix solver = new PrintSumOfRowsOfMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> rowSums = solver.rowSum(matrix);
        System.out.println("Row sums: " + rowSums); // [6, 15, 24]
    }
}