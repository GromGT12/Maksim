package home_work_14.Task1;

public class Application {
    public static void main(String[] args) {
        DatabaseConnectorImpl databaseConnector = new DatabaseConnectorImpl();
        try {
            databaseConnector.connectToDatabase();
        } catch (DatabaseCheckedException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Закрываем ресурсы");
        }
    }
}
