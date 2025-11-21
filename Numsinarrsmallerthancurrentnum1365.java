public class Numsinarrsmallerthancurrentnum1365 {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if (nums[j] < nums[i])
                    count++;
            }
        ans[i] = count;
    }
        return ans;    
    }
}
