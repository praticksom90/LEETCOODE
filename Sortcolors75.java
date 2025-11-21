

public class Sortcolors75 {
    public static void main(String[] args) {

    }
    //  public void sortColors(int[] nums) {
    //      ArrayList<Integer> i = new ArrayList<>();
    //      Arrays.sort(nums);
    //      System.out.println(Arrays.toString(nums));
    // }
public void sortColors(int[] arr) {
         int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
  }

}
