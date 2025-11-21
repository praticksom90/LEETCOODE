public class Smallestlettergreaterthantarget744 {
    public static void main(String[] args) {

    }
public char nextGreatestLetter(char[] letters, char target) {
    int start = 0, end = letters.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (letters[mid] <= target) {
            start = mid + 1; // need bigger letter
        } else {
            end = mid - 1;   // letter > target, move left
        }
    }

    // if start is past the last index, wrap around → return letters[0]
    if (start == letters.length) {
        return letters[0];
    } else {
        return letters[start]; // normal case
    }
//return letters[start % letters.length];//this  works too same complexity

}


}
