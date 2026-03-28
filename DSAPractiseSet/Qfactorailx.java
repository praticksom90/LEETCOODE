public class Qfactorailx {
    public static void main(String[] args) {
        // int a = factorial(-8);
        // System.out.println("The fato
        // rial is = "+a);
        factorial(-9);
        factorial(6);
        factorial(0);
        factorial(1);
        // factorial();

    }
  static void factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid input. Factorial not defined for negative numbers.");
            return;
        }

        int fac = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }

        System.out.println("The factorial of " + n + " is = " + fac);
}
}
