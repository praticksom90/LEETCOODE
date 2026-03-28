public class Qpythagoraintripletfx {
    public static void main(String[] args) {
        checkPythagoreanTriplet(3, 4, 5);   // ✅ Triplet
        checkPythagoreanTriplet(5, 12, 13); // ✅ Triplet
        checkPythagoreanTriplet(8, 6, 10);  // ❌ Not a triplet
    }

    static void checkPythagoreanTriplet(int a, int b, int c) {
        // Find the largest (hypotenuse)
        int x = Math.max(a, Math.max(b, c));
        int y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        if (x * x == y * y + z * z) {
            System.out.println("Yes, it is a Pythagorean triplet.");
        } else {
            System.out.println("Nope, not a Pythagorean triplet.");
        }
    }
    }

