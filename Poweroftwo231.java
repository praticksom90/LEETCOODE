public class Poweroftwo231 {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(isPowerOfTwo(a));
    }
    public  boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;

    while (n % 2 == 0) {
        n /= 2;
    }

    return n == 1;
}
}
