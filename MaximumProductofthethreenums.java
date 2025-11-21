import java.util.Arrays;

public class MaximumProductofthethreenums {
    public static void main(String[] args) {

    }
//sorting approach(simple)
public int MaximumProduct(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    //3 largest numbers
    int prod1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
    //2 smallest (negative) numbers*largest
    int prod2 = nums[0] * nums[1] * nums[n - 1];
    return Math.max(prod1, prod2);
}
//optimised approach(O(n) without sorting)

    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // Update top 3 largest
            if (num > max1) { max3 = max2; max2 = max1; max1 = num; }
            else if (num > max2) { max3 = max2; max2 = num; }
            else if (num > max3) { max3 = num; }

            // Update 2 smallest
            if (num < min1) { min2 = min1; min1 = num; }
            else if (num < min2) { min2 = num; }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}


