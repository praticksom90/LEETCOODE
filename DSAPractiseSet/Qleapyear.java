public class Qleapyear {
    public static void main(String[] args) {
        int year = 1079;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("leap");
        } else {
            System.out.println("no leap");
        }
    }
}