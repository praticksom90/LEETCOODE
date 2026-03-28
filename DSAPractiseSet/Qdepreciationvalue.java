import java.util.Scanner;

public class Qdepreciationvalue {
    public static void main(String[] args) {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter original cost of the asset: ₹");
        double costPrice = sc.nextDouble();

        System.out.print("Enter scrap value (value after full use): ₹");
        double scrapValue = sc.nextDouble();

        System.out.print("Enter useful life (in years): ");
        int life = sc.nextInt();

        // Depreciation calculation
        double depreciation = (costPrice - scrapValue) / life;

        System.out.println("Annual Depreciation: ₹" + depreciation);

        sc.close();
    }
}
