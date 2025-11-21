public class Guessnumhigherorlowergame374 {
    public static void main(String[] args) {

    }
    /** 
 * Forward declaration of guess API.
 * @param num   your guess
 * @return      -1 if the picked number is lower, 1 if higher, 0 if correct
 * int guess(int num);
 */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);
            
            if (res == 0) {
                return mid; // found the number
            } else if (res < 0) {
                end = mid - 1; // pick is lower
            } else {
                start = mid + 1; // pick is higher
            }
        }
        
        return -1; // should never reach here if pick is in [1,n]
    }
}
}
