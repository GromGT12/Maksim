package by_practice.parsing_jakson;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "car.xml";
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(filePath);
        List<CarXML> cars = parserCarsFromXml(filePath);


        for (CarXML car : cars) {
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year of release: " + car.getYear());
            System.out.println("Type fuel: " + car.getFuelType());
            System.out.println("Type body: " + car.getBodyType());
            System.out.println();
        }
    }

    public static List<CarXML> parserCarsFromXml(String filePath) {
        List<CarXML> cars = new ArrayList<>();

        try {
            ClassLoader classLoader = Main.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputStream);
            doc.getDocumentElement().normalize();

            NodeList carNodes = doc.getElementsByTagName("car");

            for (int i = 0; i < carNodes.getLength(); i++) {
                Element carElement = (Element) carNodes.item(i);
                String brand = carElement.getElementsByTagName("brand").item(0).getTextContent();
                String model = carElement.getElementsByTagName("model").item(0).getTextContent();
                int year = Integer.parseInt(carElement.getElementsByTagName("year").item(0).getTextContent());
                String fuelType = carElement.getElementsByTagName("fuelType").item(0).getTextContent();
                String bodyType = carElement.getElementsByTagName("bodyType").item(0).getTextContent();

                CarXML car = new CarXML(brand, model, fuelType, bodyType, year);
                cars.add(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cars;
    }
}
