public class Powerofthree326 {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(isPowerOfThree(a));
    }
   
    public boolean isPowerOfThree(int n) {
        // base cases
        if (n == 1) return true;   // 3^0
        if (n <= 0 || n % 3 != 0) return false;

        // recursive step
        return isPowerOfThree(n / 3);
    }
}


