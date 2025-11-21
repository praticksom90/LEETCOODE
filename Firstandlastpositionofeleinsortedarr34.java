public class Firstandlastpositionofeleinsortedarr34 {
    public static void main(String[] args) {

    }
   public int[] searchRange(int[] nums, int target) {
    int first = findFirst(nums, target);
    int last = findLast(nums, target);
    return new int[]{first, last};
}

private int findFirst(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    int ans = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            ans = mid;        // record answer
            end = mid - 1;    // move left to find earlier occurrence
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return ans;
}

private int findLast(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    int ans = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            ans = mid;        // record answer
            start = mid + 1;  // move right to find later occurrence
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return ans;
}
}
