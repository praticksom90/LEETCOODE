public class Qkunalevendayshangingout {
    public static void main(String[] args) {
         int count = 0;

        for (int day = 1; day <= 31; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }

        System.out.println("Kunal can go out on " + count + " days in August.");
    }
}
