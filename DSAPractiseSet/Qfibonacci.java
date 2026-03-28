public class Qfibonacci{
public static void main(String[] args) {
    int a,b,n;
    a=0;
    b=1;
    n=8;
   int count = 2;
    while (count<=n) {
       int temp = b;
b=b+a;
a=temp;
count++;
    }
    System.out.println(b);
}
}