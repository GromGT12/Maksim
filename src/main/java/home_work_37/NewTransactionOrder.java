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
            orderStatement.setInt(1, 45);
            orderStatement.setInt(2, 12);
            orderStatement.setDate(3, Date.valueOf("2024-09-12"));
            orderStatement.setInt(4, 12);
            orderStatement.setString(5, "New order");
            orderStatement.executeUpdate();

            TransactionRecord transactionRecord = new TransactionRecord(10, 45, 31, 1);
            TransactionRecord transactionRecord1 = new TransactionRecord(13, 45, 231, 2);
            TransactionRecord transactionRecord2 = new TransactionRecord(14, 45, 12, 3);

            String insertOrderItemQuery = "INSERT INTO order_items (id, order_id, product_id, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement orderItemStatement = connection.prepareStatement(insertOrderItemQuery);
            orderItemStatement.setInt(1, transactionRecord.id());
            orderItemStatement.setInt(2, transactionRecord.order_id());
            orderItemStatement.setInt(3, transactionRecord.product_id());
            orderItemStatement.setInt(4, transactionRecord.quantity());
            orderItemStatement.executeUpdate();

            List<TransactionRecord> transactionRecordList = new ArrayList<>();
            transactionRecordList.add(transactionRecord);
            transactionRecordList.add(transactionRecord1);
            transactionRecordList.add(transactionRecord2);

            for (TransactionRecord record : transactionRecordList)
                System.out.println(record);

            connection.commit();

            System.out.println("Транзакция успешно завершена.");
        } catch (ClassNotFoundException | SQLException e) {

        }
    }
}
