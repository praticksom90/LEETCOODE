

public class Numberof1bits191 {
    public static void main(String[] args) {
        // int a = 6;
        // System.out.println(hammingWeight(a));
    }

    //     public static int hammingWeight(int num) {
    //     //inbuilt method to change a num to binary
    // //    int num = 10;
    // // String binary = Integer.toBinaryString(num);
    // // System.out.println(binary);  // prints "1010"

    // //manual method to change a num to binary
    // StringBuilder sb = new StringBuilder();

    // while (num > 0) {
    //     int bit = num % 2;   // get remainder (0 or 1)
    //     sb.append(bit);      // add it
    //     num = num / 2;       // reduce the number
    // }
    // int count = 0;
    // sb.reverse(); // because bits are collected backwards
    // // System.out.println(sb.toString());  // prints "1010"
    // for (char c : sb.toString().toCharArray()) {
    //     if (c=='1') {
    //         count++;
    //     }
    // }
    // return count;
    //     }

    //leetcode code
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // removes the last set bit
            count++;
        }
        return count;
    }

}
