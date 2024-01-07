package by_practice.copy;

public class ShallowCopying {
    public static void main(String[] args) {
        Product product = new Product("Iphone 14 Pro", 1200);
        Product copyOfProduct = new Product(product.getName(), product.getPrice());

        product.setName("Samsung");
        System.out.println(product.getName());
        System.out.println(copyOfProduct.getName());
    }
}
