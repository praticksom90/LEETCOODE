public class Singlenumber136 {
    public static void main(String[] args) {
        int[] arr = { 2,1,1 };
        int a = singleNumber(arr);
     System.out.println(a);
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
