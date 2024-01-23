package by_practice.Enum;

public class EnumToString {

    private enum Weekdays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    private enum ColdDrink {
        PEPSI("Pepsi"), COKE("Coca Cola"), SPRITE("Sprite");

        private String brandname;

        private ColdDrink(String brand) {
            this.brandname = brand;
        }

        @Override
        public String toString() {
            return brandname;
        }
    }

    public static void main(String args[]) {
        // Преобразование перечисления в строку с использованием метода name()
        // По умолчанию метод print вызывает toString() перечисления
        ColdDrink[] drinks = ColdDrink.values();
        for (ColdDrink drink : drinks) {
            System.out.printf("Пример преобразования строки в перечисление с использованием имени: %s%n", drink.name());
        }

        // Преобразование Enum в String с использованием метода toString()
        for (ColdDrink drink : drinks) {
            System.out.println("Преобразование строки в перечисление с помощью toString(): " + drink);
        }
    }
}
