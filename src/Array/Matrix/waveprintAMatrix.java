package Array.Matrix ;
import java.util.ArrayList;
import java.util.List;

public class waveprintAMatrix {

    public List<Integer> wavePrint(int[][] arr){
        List<Integer> ansArray = new ArrayList<>();
        for(int i = 0 ; i < arr[0].length ; i++){
            if( i%2==0 ){
            for(int j = 0 ; j < arr.length ; j++){
                ansArray.add(arr[j][i]);
            }}
            else {
                for(int j = arr.length-1 ; j >= 0 ; j--){
                    ansArray.add(arr[j][i]);
                }
            }
        }
        return ansArray;
    }

    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        waveprintAMatrix obj = new waveprintAMatrix() ;
        System.out.println("Wave print of the matrix:");
        System.out.println(obj.wavePrint(matrix));
    }
}
