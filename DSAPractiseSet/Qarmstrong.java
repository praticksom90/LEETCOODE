import java.util.Scanner;

public class Qarmstrong {
    public static void main(String[] args) {
System.out.println("Please enter three digit no.!!! ");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter lower limit = ");
        int lowerlimit = s.nextInt();
        System.out.print("Enter upper limit = ");
        int upperlimit = s.nextInt();
        
       for (int num = lowerlimit; num <= upperlimit; num++) {
            int original = num;
            int sum;

            int a = num % 10;         // unit digit
            int b = (num / 10) % 10;  // tens digit
            int c = num / 100;        // hundreds digit

            sum = (a * a * a) + (b * b * b) + (c * c * c);

            if (sum == original) {
                System.out.println(original + " is an Armstrong number");
            }
        }


    }
}
