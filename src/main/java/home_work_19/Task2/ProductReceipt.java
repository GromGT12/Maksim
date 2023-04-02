package home_work_19.Task2;


import java.math.BigDecimal;
import java.util.Objects;

// переименуй плиз просто в Product
public class ProductReceipt {
    private int id;
    private String productTitle;
    private BigDecimal price;

    public ProductReceipt(int id, String productTitle, int price) {
        this.id = id;
        this.productTitle = productTitle;
        this.price = BigDecimal.valueOf(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductReceipt that = (ProductReceipt) o;
        return id == that.id && Objects.equals(productTitle, that.productTitle) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productTitle, price);
    }

    @Override
    public String toString() {
        return "ProductReceipt{" +
                "id=" + id +
                ", productTitle='" + productTitle + '\'' +
                ", price=" + price +
                '}';
    }
}
