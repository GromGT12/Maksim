package home_work_19.Task2;


/*
Task 2
Создайте класс для описания товара в чеке. В классе храните int id (артикул), название товара и
ProductReceipt цену одной единицы товара.
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
        ProductReceipt productReceipt = new ProductReceipt(1455, "Cosmetics", 10);
        ProductReceipt productReceipt1 = new ProductReceipt(2230, "Vegetables", 3);
        ProductReceipt productReceipt2 = new ProductReceipt(1150, "Сar parts", 40);
        ProductReceipt productReceipt3 = new ProductReceipt(4580, "Household chemicals", 13);
        ProductReceipt productReceipt4 = new ProductReceipt(2230, "Vegetables", 3);
        ProductReceipt productReceipt5 = new ProductReceipt(1455, "Cosmetics", 10);

        ArrayList<ProductReceipt> productReceiptList = new ArrayList<>(List.of(productReceipt, productReceipt1, productReceipt2, productReceipt3, productReceipt4, productReceipt5));
        calculateCheck(productReceiptList);
    }

    private static void calculateCheck(ArrayList<ProductReceipt> productReceiptList) {
        Map<ProductReceipt, Integer> itemCount = new HashMap<>();
        for (ProductReceipt productReceipt : productReceiptList) {
            if (itemCount.containsKey(productReceipt)) {
                Integer count = itemCount.get(productReceipt);
                Integer updatedCount = count + 1;
                itemCount.put(productReceipt, updatedCount);
            } else {
                itemCount.put(productReceipt, 1);
            }
        }
        BigDecimal sum = BigDecimal.ZERO;
        for (Map.Entry<ProductReceipt, Integer> entry : itemCount.entrySet()) {
            BigDecimal price = entry.getKey().getPrice();
            sum = sum.add(price.multiply(BigDecimal.valueOf(entry.getValue())));
        }
        System.out.println(itemCount);
        System.out.println(sum);
    }
}







