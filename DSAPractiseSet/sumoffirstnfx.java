public class sumoffirstnfx {
    public static void main(String[] args) {
     int a = sumtilln(8);   
     System.out.println(a);
    }
static int sumtilln(int n){
int sum=0;

    for (int i = 0; i <= n; i++) {
        sum+=i;
    }
return sum;
}
}
