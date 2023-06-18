package home_work_37;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewTransactionOrder {
    private static final String URL = "jdbc:postgresql://localhost:5432/home_work_from_backup";
    private static final String NAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        CreatingNewOrderInTransaction();
    }

    public static void CreatingNewOrderInTransaction() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            connection.setAutoCommit(false);

            String insertOrderQuery = "INSERT INTO orders (id, user_id, created_at, status_id, comment) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement orderStatement = connection.prepareStatement(insertOrderQuery);
            orderStatement.setInt(1, 60);
            orderStatement.setInt(2, 12);
            orderStatement.setDate(3, Date.valueOf("2025-09-12"));
            orderStatement.setInt(4, 12);
            orderStatement.setString(5, "New order");
            orderStatement.executeUpdate();

            TransactionRecord transactionRecord = new TransactionRecord(10, 60, 31, 1);
            TransactionRecord transactionRecord1 = new TransactionRecord(13, 60, 131, 2);
            TransactionRecord transactionRecord2 = new TransactionRecord(14, 60, 11, 3);

            String insertOrderItemQuery = "INSERT INTO order_items (id, order_id, product_id, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement orderItemStatement = connection.prepareStatement(insertOrderItemQuery);

            List<TransactionRecord> transactionRecordList = new ArrayList<>();
            transactionRecordList.add(transactionRecord);
            transactionRecordList.add(transactionRecord1);
            transactionRecordList.add(transactionRecord2);


            for (TransactionRecord record : transactionRecordList) {
                orderItemStatement.setInt(1, record.id());
                orderItemStatement.setInt(2, record.order_id());
                orderItemStatement.setInt(3, record.product_id());
                orderItemStatement.setInt(4, record.quantity());
                orderItemStatement.addBatch();
                System.out.println(record);
            }
            orderItemStatement.executeBatch();
            connection.commit();
            System.out.println("Транзакция успешно завершена.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
}
