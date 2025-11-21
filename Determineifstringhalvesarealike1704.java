public class Determineifstringhalvesarealike1704 {
    public static void main(String[] args) {

    }
 public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count1 = 0, count2 = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count1++;          // first half
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) count2++; // second half
        }

        return count1 == count2;
    }
}
