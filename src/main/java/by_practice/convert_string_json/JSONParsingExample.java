package by_practice.convert_string_json;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JSONParsingExample {
    public static void main(String[] args) throws Exception {
        // Пример объекта класса City
        City city = new City("London", "UK", 8982000, 1572.0);

        // Парсинг с использованием Gson
        Gson gson = new Gson();
        String gsonJson = gson.toJson(city);
        City gsonCity = gson.fromJson(gsonJson, City.class);
        System.out.println("Gson parsed city: " + gsonCity);

        // Парсинг с использованием Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        String jacksonJson = objectMapper.writeValueAsString(city);
        City jacksonCity = objectMapper.readValue(jacksonJson, City.class);
        System.out.println("Jackson parsed city: " + jacksonCity);

        // Парсинг с использованием JSON.simple
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", city.getName());
        jsonObject.put("country", city.getCountry());
        jsonObject.put("population", city.getPopulation());
        jsonObject.put("area", city.getArea());

        String jsonSimpleJson = jsonObject.toJSONString();
        JSONParser parser = new JSONParser();
        JSONObject parsedJsonObject = (JSONObject) parser.parse(jsonSimpleJson);
        City jsonSimpleCity = new City(
                (String) parsedJsonObject.get("name"),
                (String) parsedJsonObject.get("country"),
                ((Long) parsedJsonObject.get("population")).intValue(),
                (Double) parsedJsonObject.get("area")
        );
        System.out.println("JSON.simple parsed city: " + jsonSimpleCity);
    }
}
