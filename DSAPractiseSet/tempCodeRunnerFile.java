public class Qperfectnum {
    public static void main(String[] args) {
        int n = 28;
        int k = 1;
int sum = 0;
while (k<n) { 
    if (n%k==0) {
        sum+=k;
    } 
}
if (sum==n) {
    System.out.println("Perfect num ");
}
else{
    System.out.println("Nope");
}
    }
}