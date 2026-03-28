public class Qfactorsofnum {
    public static void main(String[] args) {
        int n = 98879;

        for (int i = 2; i < n; i++) {
            
if (n%i==0) {
    System.out.println(i+" is a factor");
} 
        }
    }
}
