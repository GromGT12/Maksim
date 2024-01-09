package by_practice.copy2;

public class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Создаем новый объект и копируем примитивные поля
        Product clonedProduct = (Product) super.clone();

        // Клонируем ссылочные поля (глубокое клонирование)
        // В данном случае нет ссылочных полей, но если бы они были, нужно было бы их клонировать.

        return clonedProduct;
    }
}