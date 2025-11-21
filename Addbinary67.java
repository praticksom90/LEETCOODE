public class Addbinary67 {
    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int bitA = 0;
            int bitB = 0;

            if (i >= 0) {
                if (a.charAt(i) == '1') {
                    bitA = 1;
                } else {
                    bitA = 0;
                }
                i--;
            }

            if (j >= 0) {
                if (b.charAt(j) == '1') {
                    bitB = 1;
                } else {
                    bitB = 0;
                }
                j--;
            }

            int sum = bitA + bitB + carry;
            result.append(sum % 2); // add current bit
            carry = sum / 2; // update carry
        }

        return result.reverse().toString();
    }

}




























































































































































































































