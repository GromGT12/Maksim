package by_practice.package_by_copy.copy4;

public class ShallowCopyingWithSerialization {
    public static void main(String[] args) {
        Product product = new Product("Iphone 14 Pro", 1200, "Electronics");
        Product copyOfProduct = product.clone();

        product.setCategory("Smartphones");

        System.out.println(product.getCategory());       // Вывод: Smartphones
        System.out.println(copyOfProduct.getCategory()); // Вывод: Electronics
    }
}
