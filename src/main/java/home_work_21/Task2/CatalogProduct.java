package home_work_21.Task2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CatalogProduct {
    public static void main(String[] args) {

        Product product = new Product();
        Map<Integer, Product> mapProduct = new HashMap<>();
        mapProduct.put(1122, (new Product(1122, "MacBook Air m1 13,3 512GB", "notebook")));
        mapProduct.put(1123, (new Product(1123, "MacBook Pro m2 16 1TB", "notebook")));
        mapProduct.put(1124, (new Product(1124, "Iphone 12 mini 128GB", "smartphone")));
        mapProduct.put(1125, (new Product(1125, "Iphone 13 Pro 256GB", "smartphone")));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожалоать в магазин электронной техники \n" +
                "Меню каталога:\n" +
                "1.Ввод id и поиск товара\n" +
                "2.Такого товара нет к сожалению\n" +
                "3.Выход из каталога");
        System.out.println();
        while (true) {
            System.out.println("1: Введите id и выбирете товар");
            int id = scanner.nextInt();

            if (id == 0) {
                System.out.println("3: Спасибо, что посетили наш магазин. Приходите еще");
                System.exit(0);
            }
            if (mapProduct.containsKey(id)) {
                System.out.println(mapProduct.get(id));
            } else {
                System.out.printf("2: В нашем магазине нет товара с id - %d", id);
                System.out.println();
            }
        }
    }
}




