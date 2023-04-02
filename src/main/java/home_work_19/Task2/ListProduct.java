package home_work_19.Task2;


/*
Task 2
Создайте класс для описания товара в чеке. В классе храните int id (артикул), название товара и
Product цену одной единицы товара.
В классе Application создайте список товаров (как в корзине в магазине), добавьте в него товары,
причем некоторые товары добавьте
по несколько раз.
Напишите метод, который принимает на вход этот список, и выводит в консоль чек: товар - количество и в
конце суммарную стоимость всех товаров в чеке

 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProduct {
    public static void main(String[] args) {
        Product productReceipt = new Product(1455, "Cosmetics", 10);
        Product productReceipt1 = new Product(2230, "Vegetables", 3);
        Product productReceipt2 = new Product(1150, "Сar parts", 40);
        Product productReceipt3 = new Product(4580, "Household chemicals", 13);
        Product productReceipt4 = new Product(2230, "Vegetables", 3);
        Product productReceipt5 = new Product(1455, "Cosmetics", 10);

        ArrayList<Product> productReceiptList = new ArrayList<>(List.of(productReceipt, productReceipt1, productReceipt2, productReceipt3, productReceipt4, productReceipt5));
        calculateCheck(productReceiptList);
    }

    private static void calculateCheck(ArrayList<Product> productReceiptList) {
        Map<Product, Integer> itemCount = new HashMap<>();
        for (Product productReceipt : productReceiptList) {
            if (itemCount.containsKey(productReceipt)) {
                Integer count = itemCount.get(productReceipt);
                Integer updatedCount = count + 1;
                itemCount.put(productReceipt, updatedCount);
            } else {
                itemCount.put(productReceipt, 1);
            }
        }
        BigDecimal sum = BigDecimal.ZERO;
        for (Map.Entry<Product, Integer> entry : itemCount.entrySet()) {
            BigDecimal price = entry.getKey().getPrice();
            sum = sum.add(price.multiply(BigDecimal.valueOf(entry.getValue())));
        }
        System.out.println(itemCount);
        System.out.println(sum);
    }
}







