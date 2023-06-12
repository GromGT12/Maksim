package home_work_36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// плиз назови класс более инфтрмативно
public class CreateTable {
    private static final String URL = "jdbc:postgresql://localhost:5432/home_work_from_backup";
    private static final String NAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        runSelectAllQuery();
    }

    // плиз назови метод более информативно
    public static void runSelectAllQuery() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            ProductRecord productRecord = new ProductRecord(55, "Coca Cola", "sugar-free", 2.99);
            ProductRecord productRecord2 = new ProductRecord(56, "Nuts", "Charge your brains", 1.60);
            ProductRecord productRecord3 = new ProductRecord(77, "Stimorol", "Taste on the brink", 1.10);

            // такой подход работает, но что, если нужно вставить 15 записей? нужно использовать цикл, попрпавь, плиз
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products(id, name, description, price) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, productRecord.id());
            preparedStatement.setString(2, productRecord.name());
            preparedStatement.setString(3, productRecord.description());
            preparedStatement.setDouble(4, productRecord.price());
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, productRecord2.id());
            preparedStatement.setString(2, productRecord2.name());
            preparedStatement.setString(3, productRecord2.description());
            preparedStatement.setDouble(4, productRecord2.price());
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, productRecord3.id());
            preparedStatement.setString(2, productRecord3.name());
            preparedStatement.setString(3, productRecord3.description());
            preparedStatement.setDouble(4, productRecord3.price());
            preparedStatement.executeUpdate();

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}


