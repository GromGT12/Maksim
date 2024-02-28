package by_practice.IT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductService productService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testAddProduct() throws Exception {
        // Arrange
        Product product = new Product("Test Product", 10.0);

        // Act
        mockMvc.perform(MockMvcRequestBuilders.post("/products")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(product)))
                .andExpect(MockMvcResultMatchers.status().isOk());

        // Assert
        assertTrue(productService.getAllProducts().contains(product));
    }

    @Test
    public void testGetAllProducts() throws Exception {
        // Arrange
        List<Product> expectedProducts = new ArrayList<>();
        expectedProducts.add(new Product("Product 1", 10.0));
        expectedProducts.add(new Product("Product 2", 20.0));
        for (Product product : expectedProducts) {
            productService.addProduct(product);
        }

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/products")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(expectedProducts)));
    }

    @Test
    public void testDeleteProduct() throws Exception {
        // Arrange
        Product product = new Product("Test Product", 10.0);
        productService.addProduct(product);

        // Act
        mockMvc.perform(MockMvcRequestBuilders.delete("/products/{id}", product.getId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

        // Assert
        assertFalse(productService.getAllProducts().contains(product));
    }
}
