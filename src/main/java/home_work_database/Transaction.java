package home_work_database;


import org.apache.commons.lang3.RandomUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {

    private static final String URL = "jdbc:postgresql://localhost:5432/home_work_from_backup";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";
    public static void main(String[] args) {
        runTransactionExample();
    }
    private static void runTransactionExample() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            connection.setAutoCommit(false);

            String updateAccountQuery = "UPDATE account SET amount = ? WHERE name = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateAccountQuery);

            updateStatement.setInt(1, 600);
            updateStatement.setString(2, "Maks");

            updateStatement.executeUpdate();
            System.out.println("Updated Maks!");

            if (RandomUtils.nextBoolean()) {
                throw new RuntimeException("пропал свет!");
            }

            updateStatement.setInt(1, 400);
            updateStatement.setString(2, "Vasya");
            updateStatement.executeUpdate();

            System.out.println("Updated Vasya!");

            connection.commit();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
