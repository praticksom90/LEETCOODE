import java.util.Scanner;

public class Qncrnpr {

    // Method to calculate factorial
    static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values of n and r
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        // Validate input
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input! n must be ≥ r and both should be ≥ 0.");
        } else {
            long nFact = factorial(n);
            long rFact = factorial(r);
            long nMinusRFact = factorial(n - r);

            long nCr = nFact / (rFact * nMinusRFact);
            long nPr = nFact / nMinusRFact;

            System.out.println("nCr (Combination): " + nCr);
            System.out.println("nPr (Permutation): " + nPr);
        }

        sc.close();
    }
}
