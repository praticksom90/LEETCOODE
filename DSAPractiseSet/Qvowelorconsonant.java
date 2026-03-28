import java.util.Scanner;

public class Qvowelorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single alphabet: ");
        char ch = sc.next().charAt(0);

        // Check if it's a letter
        if (!Character.isLetter(ch)) {
            System.out.println("Not a valid alphabet character!");
        } else {
            // Convert to lowercase for easier comparison
            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        }

        sc.close();
    }
}

