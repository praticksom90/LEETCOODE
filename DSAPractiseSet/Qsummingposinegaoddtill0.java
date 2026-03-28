import java.util.Scanner;

public class Qsummingposinegaoddtill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negSum = 0, evenSum = 0, oddSum = 0;
        int num;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) break;

            if (num < 0) {
                negSum += num;
            } else if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of negative numbers: " + negSum);
        System.out.println("Sum of positive even numbers: " + evenSum);
        System.out.println("Sum of positive odd numbers: " + oddSum);
        sc.close();
    }
}
