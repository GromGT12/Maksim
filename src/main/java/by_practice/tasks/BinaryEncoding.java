package by_practice.tasks;

public class BinaryEncoding {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        } else {
            StringBuilder binary = new StringBuilder();
            while (decimalNumber > 0) {
                binary.insert(0, decimalNumber % 2);
                decimalNumber = decimalNumber / 2;
            }
            return binary.toString();
        }
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }

        int toDecimal = 0;
        int power = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binaryNumber.charAt(i));
            toDecimal += digit * Math.pow(2, power);
            power++;
        }
        return toDecimal;
    }
}

