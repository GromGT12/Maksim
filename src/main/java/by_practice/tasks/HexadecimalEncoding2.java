package by_practice.tasks;

public class HexadecimalEncoding2 {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return ""; // Возвращаем пустую строку для пустой строки или null, как указано в задании
        }

        // Проверка на наличие символов, отличных от 0 и 1
        if (!binaryNumber.matches("[01]+")) {
            return "";
        }

        // Конвертация из двоичной в шестнадцатеричную без использования Integer.parseInt
        int decimalNumber = 0;
        int base = 1;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                decimalNumber += base;
            }
            base *= 2;
        }

        return Integer.toHexString(decimalNumber);
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return ""; // Возвращаем пустую строку для пустой строки или null, как указано в задании
        }

        // Проверка на наличие некорректных символов в шестнадцатеричной строке
        if (!hexNumber.matches("[0-9a-fA-F]+")) {
            return "";
        }

        // Конвертация из шестнадцатеричной в двоичную
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        return Integer.toBinaryString(decimalNumber);
    }
}
