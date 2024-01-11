package by_practice.package_by_copy.copy2;

public class ShallowCopyingWithCloneCopying {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product("Iphone 14 Pro", 1200);
        Product copyOfProduct = (Product) product.clone();

        product.setName("Samsung");

        System.out.println(product.getName());
        System.out.println(copyOfProduct.getName());
    }
}
