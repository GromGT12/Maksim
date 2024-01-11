package by_practice.package_by_copy.copy_searization;

import java.io.Serializable;

public class Category implements Serializable {
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() { return categoryName; }

    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
}
