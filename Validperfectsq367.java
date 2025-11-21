public class Validperfectsq367 {
    public static void main(String[] args) {

    }
 public boolean isPerfectSquare(int num) {
        if (num < 1) return false;

        int start = 1, end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;

            if (sq == num) return true;       // perfect square found
            else if (sq < num) start = mid + 1;
            else end = mid - 1;
        }

        return false; // not a perfect square
    }
}
