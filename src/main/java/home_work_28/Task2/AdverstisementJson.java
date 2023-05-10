package home_work_28.Task2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AdverstisementJson {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

       InputStream resource = ClassLoader.getSystemResourceAsStream("Task2/Advertisement.Json");
        List<JacksonAdvertisement> filterCar = objectMapper.readValue(resource, new TypeReference<>() {
        });
        System.out.println(filterCar);

        resource = ClassLoader.getSystemResourceAsStream("Task2/Advertisement.Json");
        Car car = objectMapper.readValue(resource, Car.class);

        System.out.println(car);

    }
}
