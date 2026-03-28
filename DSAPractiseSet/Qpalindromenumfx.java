public class Qpalindromenumfx {
    public static void main(String[] args) {
 checkPalindrome(121);   // ✅ Palindrome
        checkPalindrome(123);   // ❌ Not palindrome
        checkPalindrome(0);     // ✅ Palindrome
        checkPalindrome(1221);  // ✅ Palindrome
    }

    static void checkPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if (rev == original) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
    }
