package by_practice.tasks;

// Интерфейс продукта
interface Product {
    void display();
}

// Конкретные реализации продукта
class ConcreteProduct1 implements Product {
    @Override
    public void display() {
        System.out.println("Concrete Product 1");
    }
}

class ConcreteProduct2 implements Product {
    @Override
    public void display() {
        System.out.println("Concrete Product 2");
    }
}

// Интерфейс фабрики
interface Factory {
    Product createProduct();
}

// Конкретные реализации фабрики
class ConcreteFactory1 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}

class ConcreteFactory2 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}

// Клиентский код
public class FactoryMethodExample {
    public static void main(String[] args) {
        Factory factory1 = new ConcreteFactory1();
        Product product1 = factory1.createProduct();
        product1.display();

        Factory factory2 = new ConcreteFactory2();
        Product product2 = factory2.createProduct();
        product2.display();
    }
}
