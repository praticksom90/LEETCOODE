import java.util.Scanner;

public class Qcgpa{

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        double totalGPA = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter GPA for subject " + i + ": ");
            double gpa = sc.nextDouble();

            // Validate GPA range (0.0 to 10.0)
            if (gpa < 0 || gpa > 10) {
                System.out.println("Invalid GPA! Must be between 0 and 10.");
                i--; // ask again
                continue;
            }

            totalGPA += gpa;
        }

        double cgpa = totalGPA / subjects;
        System.out.println("Your CGPA is: " + cgpa);

        sc.close();
    }
}