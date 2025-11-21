public class Thirdmaxnum414 {
    public static void main(String[] args) {

    }
   public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            long val = num; // convert int to long for null comparison
            if (first != null && val == first) continue;
            if (second != null && val == second) continue;
            if (third != null && val == third) continue;

            if (first == null || val > first) {
                third = second;
                second = first;
                first = val;
            } else if (second == null || val > second) {
                third = second;
                second = val;
            } else if (third == null || val > third) {
                third = val;
            }
        }

        return third != null ? third.intValue() : first.intValue();
    }

}
