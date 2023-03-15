package home_work_14.Task1;

public class Application {
    public static void main(String[] args) {
        DatabaseConnectorImpl databaseConnector = new DatabaseConnectorImpl();
        try {
            databaseConnector.connectToDatabase();
        } catch (DatabaseCheckedException exception) {
            System.out.println(exception.getMessage());
        } finally {
            // Блок finally выполнится всегда. Если databaseConnector.connectToDatabase() бросил ошибку, то это значит,
            // что подключиться не удалось. А у нас тут все равно в консоль выведется "Подключено".  вданном случае я
            // просто поменял бы текст сообщения на "Закрываем ресурсы". Поменяй плиз текст
            System.out.println("Подлключенно");
        }
    }
}
