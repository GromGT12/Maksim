package home_work_37;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
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

            OrderItem transactionRecord = new OrderItem(10, 60, 31, 1);
            OrderItem transactionRecord1 = new OrderItem(13, 60, 131, 2);
            OrderItem transactionRecord2 = new OrderItem(14, 60, 11, 3);

            String insertOrderItemQuery = "INSERT INTO order_items (id, order_id, product_id, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement orderItem = connection.prepareStatement(insertOrderItemQuery);

            List<OrderItem> CreateOrderItem = new ArrayList<>();
            CreateOrderItem.add(transactionRecord);
            CreateOrderItem.add(transactionRecord1);
            CreateOrderItem.add(transactionRecord2);

            for (OrderItem record : CreateOrderItem) {
                orderItem.setInt(1, record.id());
                orderItem.setInt(2, record.order_id());
                orderItem.setInt(3, record.product_id());
                orderItem.setInt(4, record.quantity());
                orderItem.addBatch();
                System.out.println(record);
            }

            orderItem.executeBatch();
            connection.commit();
            System.out.println("Транзакция успешно завершена.");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
}
