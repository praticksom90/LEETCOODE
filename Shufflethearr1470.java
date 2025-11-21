
public class Shufflethearr1470 {

    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];

        }
        return ans;
    }
}
