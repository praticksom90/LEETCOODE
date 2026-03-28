public class Qreversestring {
    public static void main(String[] args) {
        String n = "HJKGHGJHG";
        String reversed ="";
        for (int i = n.length()-1; i>=0; i--) {
    reversed =  reversed + n.charAt(i);

        }
    System.out.print(reversed);

    }
}
