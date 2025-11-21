public class Wordsearch79 {
    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, r, c, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int r, int c, String word, int index) {
        // ✅ base case: all chars matched
        if (index == word.length()) {
            return true;
        }

        // ❌ boundary + mismatch
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length
                || board[r][c] != word.charAt(index)) {
            return false;
        }

        // mark visited (temporarily change cell)
        char temp = board[r][c];
        board[r][c] = '#';

        // explore 4 directions
        boolean found = dfs(board, r + 1, c, word, index + 1) ||
                dfs(board, r - 1, c, word, index + 1) ||
                dfs(board, r, c + 1, word, index + 1) ||
                dfs(board, r, c - 1, word, index + 1);

        // backtrack (restore cell)
        board[r][c] = temp;

        return found;
    }
}