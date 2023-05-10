package home_work_28.Task2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Stream;

public class AdverstisementJson {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        InputStream resource = ClassLoader.getSystemResourceAsStream("Task2/Advertisement.Json");
        List<JacksonAdvertisement> filterCity = objectMapper.readValue(resource, new TypeReference<>() {
        });
        Stream<JacksonAdvertisement> jacksonAdvertisement = filterCity.stream()
                .filter(jacksonAdvertisement1 -> !"Минск".equalsIgnoreCase(jacksonAdvertisement1.getCity()));
        jacksonAdvertisement.forEach(System.out::println);

        String record = objectMapper.writeValueAsString(jacksonAdvertisement);
        System.out.println(record);

        File file = new File("src/main/java/home_work_28/Task2/cars_not_from_minsk.json");
        objectMapper.writeValue(file, jacksonAdvertisement);


        // до этого момента код работает, сделайте оставшуюся часть
        /*
        Отфильтруйте список, оставив обявления, где город - НЕ Минск. Сериализуте результат в строку, запишите ее
в файл cars_not_from_minsk.json
         */
    }
}
