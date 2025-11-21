public class Searchinsertposition35 {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                start = mid + 1; // search right
            } else {
                end = mid - 1;   // search left
            }
        }

        // return start; // target not found
        return end+1; // target not found

    }
}
