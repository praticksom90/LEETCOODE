public class Binarynumwithalternatingbits693 {
    public static void main(String[] args) {
        
    }
    
     public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);   // XOR with right-shifted version
        return (x & (x + 1)) == 0;  // check if x is like 111.. (all 1s)
    }
}
