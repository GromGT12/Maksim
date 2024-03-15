package by_practice.BBB;
import java.util.*;

public class Main {
    private static class Phone {
        private String brand;
        private String model;
        private int releaseYear;
        private double price;

        public Phone(String brand, String model, int releaseYear, double price) {
            this.brand = brand;
            this.model = model;
            this.releaseYear = releaseYear;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return brand + " " + model + " (" + releaseYear + "), Price: $" + price;
        }

        // Static method to compare phones by price
        public static int compareByPrice(Phone phone1, Phone phone2) {
            return Double.compare(phone1.getPrice(), phone2.getPrice());
        }

        // Static method to compare phones by model
        public static int compareByModel(Phone phone1, Phone phone2) {
            return phone1.getModel().compareTo(phone2.getModel());
        }
    }

    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", "iPhone X", 2017, 999.99));
        phones.add(new Phone("Samsung", "Galaxy S20", 2020, 1099.99));
        phones.add(new Phone("Google", "Pixel 5", 2020, 799.99));

        // Сортируем телефоны по цене, а затем по модели, используя статические ссылки на методы
        Comparator<Phone> priceComparator = Phone::compareByPrice;
        Comparator<Phone> modelComparator = Phone::compareByModel;
        Collections.sort(phones, priceComparator.thenComparing(modelComparator));

        // Выводим отсортированные телефоны
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
    