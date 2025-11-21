public class Powxn50 {
    public static void main(String[] args) {

    }
//recursive one
public double myPow(double x, int n) {
    long N = n;
    if (N < 0) {
        N = -N;
        x = 1 / x;
    }
    return fastPow(x, N);
}

private double fastPow(double x, long n) {
    if (n == 0) return 1.0;
    
    double half = fastPow(x, n / 2);
    if (n % 2 == 0) return half * half;
    else return half * half * x;
}
//iterative one 
public double myPowi(double x, int n) {
    long N = n;
    if (N < 0) {
        N = -N;
        x = 1 / x;
    }

    double ans = 1.0;
    while (N > 0) {
        if (N % 2 == 1) ans *= x;
        x *= x;
        N /= 2;
    }
    return ans;
}
}



