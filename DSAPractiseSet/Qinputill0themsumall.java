import java.util.Scanner;
public class Qinputill0themsumall{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Total sum: " + sum);
        sc.close();

}
}