public class Maximumsubarray53 {
    public static void main(String[] args) {

    }//bruteforce
     public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE; // start with something very small

        // pick start index
        for (int i = 0; i < n; i++) {
            int sum = 0; // reset sum for this new starting point

            // pick end index
            for (int j = i; j < n; j++) {
                sum += nums[j]; // keep adding from i to j
                maxSum = Math.max(maxSum, sum); // update best sum so far
            }
        }
        return maxSum;
    }//it will time error

    // kdane algo for better time

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0]; // best sum ending at this index
        int maxSum = nums[0];     // best sum overall

        for (int i = 1; i < nums.length; i++) {
            // either continue old subarray OR start new at nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // update overall max
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

