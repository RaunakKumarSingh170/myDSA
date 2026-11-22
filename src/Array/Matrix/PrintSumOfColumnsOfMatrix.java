package Array.Matrix;
import java.util.ArrayList;
import java.util.List;
public class PrintSumOfColumnsOfMatrix {

    public static List<Integer> colSum(int[][] arr){
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;
        for(int i = 0 ; i < arr[0].length ; i++){  // i = column index
            int sum = 0 ;
            for(int j = 0 ; j < arr.length ; j++){  // j = row index
                sum = sum + arr[j][i] ;
            }
            result.add(sum) ;
        }
        return result ;
    }
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> colSums = colSum(matrix);
        System.out.println("Column sums: " + colSums); // [12, 15, 18]
    }
}