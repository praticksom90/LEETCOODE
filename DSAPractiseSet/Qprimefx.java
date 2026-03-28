public class Qprimefx {
    public static void main(String[] args) {
    isprime(99);
        // System.out.println(n);
    }
    static void isprime(int n) {
        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }

        boolean flag = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    }

