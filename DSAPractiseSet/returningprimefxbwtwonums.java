public class returningprimefxbwtwonums {
    public static void main(String[] args) {
        printPrimes(4, 89);


    }

      static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i <= 1) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
