package home_work_36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductInsertion {
    private static final String URL = "jdbc:postgresql://localhost:5432/home_work_from_backup";
    private static final String NAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        insertProductsIntoDatabase();
    }

    public static void insertProductsIntoDatabase() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            ProductRecord productRecord = new ProductRecord(222, "Coca Cola", "sugar-free", 2.99);
            ProductRecord productRecord2 = new ProductRecord(56, "Nuts", "Charge your brains", 1.60);
            ProductRecord productRecord3 = new ProductRecord(77, "Stimorol", "Taste on the brink", 1.10);

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products(id, name, description, price) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, productRecord.id());
            preparedStatement.setString(2, productRecord.name());
            preparedStatement.setString(3, productRecord.description());
            preparedStatement.setDouble(4, productRecord.price());
            preparedStatement.executeUpdate();

            List<ProductRecord> productDatabaseList = new ArrayList<>();
            productDatabaseList.add(productRecord);
            productDatabaseList.add(productRecord2);
            productDatabaseList.add(productRecord3);

            for (ProductRecord record : productDatabaseList) {
                System.out.println(record);
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}


