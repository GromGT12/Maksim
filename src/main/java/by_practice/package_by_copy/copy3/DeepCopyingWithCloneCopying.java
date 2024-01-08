package by_practice.package_by_copy.copy3;

public class DeepCopyingWithCloneCopying {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product("Iphone 14 Pro", 1200, "Electronics");
        Product copyOfProducts = (Product) product.clone();

        product.setCategory("Smartphones");

        System.out.println(product.getCategory());
        System.out.println(copyOfProducts.getCategory());

    }
}
