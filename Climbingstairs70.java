public class Climbingstairs70 {
    public static void main(String[] args) {

    }
//DP solution
public int Climbingstairs(int n) {
    if (n <= 1) {
        return 1;

    }
    int[] dp = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i < n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
//optimised one (fibonacci)
public int Climbingstairso(int n) {
    if (n <= 1) {
        return 1;

    }
    int a = 1,b = 1;
    for (int i = 2; i < n; i++) {
        int c = a + b;
        a = b;
        b = c;
    }
    return b;
}
}
