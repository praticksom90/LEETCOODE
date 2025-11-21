public class DefangingIPaddress1108 {
    public static void main(String[] args) {

    }
public String defangIPaddr(String address) {
    //return address.replace(".", "[.]");
// Use StringBuilder since string concatenation in loop is costly
        StringBuilder result = new StringBuilder();

        // Traverse each character
        for (char c : address.toCharArray()) {
            if (c == '.') {
                // Replace '.' with "[.]"
                result.append("[.]");
            } else {
                // Keep other characters as is
                result.append(c);
            }
        }

        // Return the new string
        return result.toString();
    }
    }




