public class Reshapematrix566 {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // check if reshape possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];
        int row = 0, col = 0;

        // put elements one by one
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = mat[i][j];
                col++;
                if (col == c) { // move to next row
                    col = 0;
                    row++;
                }
            }
        }
        return res;
    }

}
