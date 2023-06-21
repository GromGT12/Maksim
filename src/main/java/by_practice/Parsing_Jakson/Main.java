package by_practice.Parsing_Jakson;


import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
        public static void main(String[] args){
          //  XmlMapper xmlMapper = new XmlMapper()
            String filePath = "car.xml"; // Укажите путь к вашему XML файлу
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(filePath);
            List<CarXML> cars = parserCarsFromXml(filePath);

            // Выводим информацию о машинах
            for (CarXML car : cars) {
                System.out.println("Марка: " + car.getBrand());
                System.out.println("Модель: " + car.getModel());
                System.out.println("Год выпуска: " + car.getYear());
                System.out.println("Тип топлива: " + car.getFuelType());
                System.out.println("Тип кузова: " + car.getBodyType());
                System.out.println();
            }
        }

        public static List<CarXML> parserCarsFromXml(String filePath){
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
