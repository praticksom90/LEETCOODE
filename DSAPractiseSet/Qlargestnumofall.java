import java.util.Scanner;

public class Qlargestnumofall{

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE; // Start with the smallest possible value

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > max) {
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No number was entered.");
        } else {
            System.out.println("Largest number: " + max);
        }

        sc.close();
    }
}