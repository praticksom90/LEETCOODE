public class Qproductandsubtractwithdigitsinanumber {
    public static void main(String[] args) {
        int n = 29; // you can change this number
        int sum = 0, product = 1;

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        int result = product - sum;
        System.out.println("Result: " + result);
    }
}
