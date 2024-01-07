package by_practice.rabbitmq;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class MessageSender {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        // Устанавливаем соединение с брокером
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // укажите адрес вашего RabbitMQ-сервера

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            // Объявляем очередь, если она еще не существует
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            String message = "Hello, RabbitMQ!";
            // Отправляем сообщение в очередь
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}
