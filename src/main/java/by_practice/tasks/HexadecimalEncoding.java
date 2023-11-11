package by_practice.tasks;

public class HexadecimalEncoding {
    private static final String HEX = "0123456789abc-def";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }

        StringBuilder hex = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hex.insert(0, HEX.charAt(remainder));
            decimalNumber = decimalNumber / 16;
        }
        return hex.toString();
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return 0;
        }

        int toDecimal = 0;
        for (int i = hexNumber.length() - 1; i >= 0; i--) {
            char digit = hexNumber.charAt(i);
            int digitValue = HEX.indexOf(digit);
            toDecimal += digitValue * Math.pow(16, hexNumber.length() - 1 - i);
        }
        return toDecimal;
    }
}

