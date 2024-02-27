package by_practice.IT;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.rabbitmq.client.AMQP.NOT_FOUND;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.http.HttpStatus.OK;

    @DisplayName("Тесты для оформления заказа")
    class OrderServiceTest extends Settings {

        @Test
        @DisplayName("Успешное оформление заказа")
        void placeOrder_Successful() {
            // Подготовка данных для запроса
            OrderRequest request = new OrderRequest(/* данные о заказе */);

            // Отправка запроса на оформление заказа и получение ответа
            OrderResponse response = given()
                    .body(request)
                    .when()
                    .post("/placeOrder")
                    .then()
                    .assertThat()
                    .statusCode(OK.value())
                    .extract()
                    .as(OrderResponse.class);

            // Проверка ответа на соответствие ожидаемому результату
            // Например, можно проверить статус заказа или идентификатор заказа
            assertThat(response.getStatus(), equalTo("SUCCESS"));
        }

        @Test
        @DisplayName("Неуспешное оформление заказа")
        void placeOrder_Unsuccessful() {
            // Подготовка данных для запроса
            OrderRequest request = new OrderRequest(/* некорректные данные о заказе */);

            // Отправка запроса на оформление заказа и получение ответа
            ErrorResponse response = given()
                    .body(request)
                    .when()
                    .post("/placeOrder")
                    .then()
                    .assertThat()
                    .statusCode(NOT_FOUND.value()) // Предположим, что для некорректного запроса возвращается 404
                    .extract()
                    .as(ErrorResponse.class);

            // Проверка ответа на соответствие ожидаемому результату
            // Например, можно проверить сообщение об ошибке или код ошибки
            assertThat(response.getMessage(), equalTo("Order data is invalid"));
        }
    }

}
