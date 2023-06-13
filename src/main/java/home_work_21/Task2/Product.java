package home_work_21.Task2;

import java.util.Objects;

public class Product {
    private int id;
    private String product;
    private String description;

    public Product(int id, String product, String description) {
        this.id = id;
        this.product = product;
        this.description = description;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return id == product1.id && Objects.equals(product, product1.product) && Objects.equals(description, product1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, description);
    }

    @Override
    public String toString() {
        return "ProductDatabase{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
