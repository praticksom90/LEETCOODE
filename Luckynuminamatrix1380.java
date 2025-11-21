import java.util.ArrayList;
import java.util.List;

public class Luckynuminamatrix1380 {
    public static void main(String[] args) {

    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        // step 1: check each row
        for (int i = 0; i < m; i++) {
            int minVal = Integer.MAX_VALUE;
            int colIndex = -1;

            // find min in the row
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

            // step 2: check if this minVal is max in its column
            boolean isLucky = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            // step 3: if both true, add it
            if (isLucky) {
                res.add(minVal);
            }
        }
        return res;
    }

}
