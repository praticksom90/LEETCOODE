public class Qallprevinfx {
    public static void main(String[] args) {
        checkEvenOdd(5);
        findLargest(10, 20);
        checkPalindrome(121);
        checkPrime(29);
        factorial(5);
        reverseNumber(1234);
        sumOfDigits(543);
        sumNNumbers(100);
        checkArmstrong(153);
    }

    static void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    static void findLargest(int a, int b) {
        if (a > b)
            System.out.println(a + " is larger");
        else if (b > a)
            System.out.println(b + " is larger");
        else
            System.out.println("Both are equal");
    }

    static void checkPalindrome(int n) {
        int rev = 0, original = n;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        if (rev == original)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is NOT a Palindrome");
    }

    static void checkPrime(int n) {
        if (n < 2) {
            System.out.println(n + " is NOT Prime");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is NOT Prime");
                return;
            }
        }

        System.out.println(n + " is Prime");
    }

    static void factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }

        int fac = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }

        System.out.println("Factorial of " + n + " is " + fac);
    }

    static void reverseNumber(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        System.out.println("Reversed number: " + rev);
    }

    static void sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

    static void sumNNumbers(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }

    static void checkArmstrong(int n) {
        int sum = 0, original = n, digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is NOT an Armstrong number");
    }
}
