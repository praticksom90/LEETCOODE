
import java.util.ArrayList;
import java.util.List;

public class CreateTargetarrinthegivenorder1389 {

    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);  // insert nums[i] at position index[i]
        }

        // Convert List<Integer> back to int[]
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = target.get(i);
        }

        return res;
    }
}
