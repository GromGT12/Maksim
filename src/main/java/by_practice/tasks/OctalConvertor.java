package by_practice.tasks;

public class OctalConvertor {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " equals Octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " equals Decimal number " + toDecimal(decimalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octalNumber = 0;
        if (decimalNumber <= 0) {
            return octalNumber;
        }
        int i = 0;
        while (decimalNumber != 0) {
            octalNumber = (int) (octalNumber + (decimalNumber % 8) * Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;

    }

    public static int toDecimal(int octalNumber) {
        int decimalNumber = 0;
        if (octalNumber <= 0) {
            return decimalNumber;
        }
        int i = 0;
        while (octalNumber != 0) {
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber = octalNumber / 10;
        }
        return decimalNumber;

    }
}
