public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        String binary1 = "1010"; // First binary string
        String binary2 = "1101"; // Second binary string
        
        String sum = addBinary(binary1, binary2);
        
        System.out.println("Binary 1: " + binary1);
        System.out.println("Binary 2: " + binary2);
        System.out.println("Sum: " + sum);
    }
    
    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        int i = binary1.length() - 1;
        int j = binary2.length() - 1;
        
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += binary1.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += binary2.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        
        return result.toString();
    }
}

