public class Qsumofdigitsofanum {
    public static void main(String[] args) {
        int n = 5435;
        int sum = 0;

        while (n != 0) {
            int b = n % 10;  // get last digit
            sum += b;        // add to sum
            n /= 10;         // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}

    