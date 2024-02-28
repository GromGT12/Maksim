package by_practice.IT;

import by_practice.package_by_copy.copy2.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class ProductServiceTest{

    @Test
    public void testAddProduct() {
        // Arrange
        ProductService productService = new ProductService();
        Product product = new Product("1", "Test Product", 10.0);

        // Act
        productService.addProduct(product);

        // Assert
        assertTrue(productService.getAllProducts().contains(product));
    }

    @Test
    public void testRemoveProduct() {
        // Arrange
        ProductService productService = new ProductService();
        Product product = new Product("1", "Test Product", 10.0);
        productService.addProduct(product);

        // Act
        productService.removeProduct("1");

        // Assert
        assertFalse(productService.getAllProducts().contains(product));
    }

    @Test
    public void testGetProductById() {
        // Arrange
        ProductService productService = new ProductService();
        Product product = new Product("1", "Test Product", 10.0);
        productService.addProduct(product);

        // Act
        Product retrievedProduct = productService.getProductById("1");

        // Assert
        assertNotNull(retrievedProduct);
        assertEquals(product, retrievedProduct);
    }
}

public class CustomerServiceTest {

    @Test
    public void testAddCustomer() {
        // Arrange
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("1", "John Doe", "john@example.com");

        // Act
        customerService.addCustomer(customer);

        // Assert
        assertTrue(customerService.getAllCustomers().contains(customer));
    }

    @Test
    public void testRemoveCustomer() {
        // Arrange
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("1", "John Doe", "john@example.com");
        customerService.addCustomer(customer);

        // Act
        customerService.removeCustomer("1");

        // Assert
        assertFalse(customerService.getAllCustomers().contains(customer));
    }

    @Test
    public void testGetCustomerById() {
        // Arrange
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("1", "John Doe", "john@example.com");
        customerService.addCustomer(customer);

        // Act
        Customer retrievedCustomer = customerService.getCustomerById("1");

        // Assert
        assertNotNull(retrievedCustomer);
        assertEquals(customer, retrievedCustomer);
    }
}
