public class Majorityelement169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count==0) {
                candidate = num;
                count=1;
            } else if(num==candidate   ){
                count++;
                        
        }else{
            count--;
        }}

    return candidate;
    }
}
