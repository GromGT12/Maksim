package by_practice.package_by_copy.copy_searization;

public class DeepCopyingWithSerialization {
    public static void main(String[] args) {
        Category electronics = new Category("Electronics");
        Product product = new Product("Iphone 14 Pro", 1200, electronics);
        Product copyOfProduct = product.deepClone();

        product.getCategory().setCategoryName("Smartphones");

        System.out.println(product.getCategory().getCategoryName());
        System.out.println(copyOfProduct.getCategory().getCategoryName());
    }
}
