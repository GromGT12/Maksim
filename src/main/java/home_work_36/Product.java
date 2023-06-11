package home_work_36;

/*
1. Работа с таблицей products. Создайте класс Product, который соответствует таблице products.
 С помощью цикла выведите все продукты в консоль, но за один запрос нужно прочитать 2 продукта

SELECT column_name(s) FROM table1;
UNION
SELECT column_name(s) FROM table2;

 SELECT * FROM products LIMIT 2 OFFSET 0
 SELECT * FROM products LIMIT 2 OFFSET 2
 SELECT * FROM products LIMIT 2 OFFSET 4 .....
 Для создания запроса используйте объект PreparedStatement

 2. Создайте список из трех новых продуктов и сохраните эти продукты в базу данных.
 Для создания запроса используйте объект PreparedStatement
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private static final String URL = "jdbc:postgresql://localhost:5432/home_work_from_backup";
    private static final String NAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public Product(int anInt, String string, String string1, double aDouble) {

    }

    public static void main(String[] args) {
        runSelectAllQuery();
    }

    public static void runSelectAllQuery() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
            ResultSet resultSet = statement.executeQuery();

            List<Product> productList = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));
                productList.add(product);
            }

            productList.forEach(System.out::println);

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}


