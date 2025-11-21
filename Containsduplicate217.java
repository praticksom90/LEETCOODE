import java.util.Arrays;
import java.util.HashSet;

public class Containsduplicate217 {
    public static void main(String[] args) {

    }
//normal one (good space)(bad time)  
    public boolean containsDuplicate(int[] nums) {
   //sort the array in place
        Arrays.sort(nums);
        //Check for adjacent duplicates
   for (int i = 0; i < nums.length-1; i++) {
       if (nums[i] == nums[i + 1]) {
           return true;
       }}
       return false;
   
    }

//hashset one(bad space)(good time)    
public boolean containsDuplicateh(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (!set.add(num)) {
            return true;
        }}
        return false;
    }

}


