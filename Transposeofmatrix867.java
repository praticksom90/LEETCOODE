
public class Transposeofmatrix867 {

    public static void main(String[] args) {

    }

    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns
        int[][] trans = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}
