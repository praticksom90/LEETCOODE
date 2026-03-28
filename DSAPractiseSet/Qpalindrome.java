public class Qpalindrome {
    public static void main(String[] args) {
        String n= "HuijoH";
String reversed = "";
for (int i = n.length()-1; i>=0; i--) {
    reversed =  reversed+ n.charAt(i);
}

if (n.equals(reversed)) {
    System.out.println("Yes palindrome");
} else {
    System.out.println("Not palindrome");
}
    }
}
