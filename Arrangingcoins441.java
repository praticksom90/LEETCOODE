public class Arrangingcoins441 {
    public static void main(String[] args) {

    }

    public int arrangeCoins(int n) {

        int left = 1, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;

            if (coinsNeeded == n)
                return (int) mid;
            else if (coinsNeeded < n)
                left = (int) mid + 1;
            else
                right = (int) mid - 1;
        }
        return right; // largest k where k*(k+1)/2 <= n

    }
}