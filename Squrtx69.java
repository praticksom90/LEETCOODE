public class Squrtx69 {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
    if (x == 0 || x == 1) return x; // edge cases

    int start = 0, end = x, ans = 0;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if ((long)mid * mid == x) {
            return mid; // exact square root found
        } else if ((long)mid * mid < x) {
            ans = mid;       // mid is a candidate
            start = mid + 1; // try higher
        } else {
            end = mid - 1;   // too big, go lower
        }
    }

    return ans; // largest mid whose square <= x
}

}
