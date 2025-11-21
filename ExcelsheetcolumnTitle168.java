public class ExcelsheetcolumnTitle168 {
    public static void main(String[] args) {

    }
public String convertToTitle(int n) {
    StringBuilder sb = new StringBuilder();

    while (n > 0) {
        n--;  // adjust for 1-indexing
        int rem = n % 26;
        sb.append((char) ('A' + rem)); // map 0->A, 25->Z
        n /= 26;
    }

    return sb.reverse().toString();
}
}
