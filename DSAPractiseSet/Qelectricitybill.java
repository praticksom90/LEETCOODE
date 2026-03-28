public class Qelectricitybill{
public static void main(String[] args) {
    

 Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total electricity units consumed: ");
        double units = sc.nextDouble();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else if (units <= 300) {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + 100 * 4.0 + (units - 300) * 6.0;
        }

        System.out.println("Your Electricity Bill is ₹" + bill);
        sc.close();
    }}