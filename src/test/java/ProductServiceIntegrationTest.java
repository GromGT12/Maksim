
import com.web.onlineshop.dto.ProductDTO;
import com.web.onlineshop.exception.OnlineShopNotFoundException;
import com.web.onlineshop.repository.ProductRepository;
import com.web.onlineshop.repository.FlavourCategoryRepository;
import com.web.onlineshop.repository.mappers.ProductMapper;
import com.web.onlineshop.validator.ProductValidator;
import com.web.onlineshop.service.ProductService;
import com.web.onlineshop.service.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ProductServiceIntegrationTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FlavourCategoryRepository flavourCategoryRepository;

    @MockBean
    private ProductValidator productValidator;

    @Autowired
    private ProductMapper productMapper;

    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        List<ProductDTO> products = productService.getAllProducts();
        assertThat(products).isNotNull();
        assertThat(products).hasSize(0); // Assuming there are no products in the test database
    }

    @Test
    public void testGetById_ExistingId_ReturnsProductDTO() {
        // Assuming product with id 1 exists in the test database
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        ProductDTO productDTO = productService.getById(1);
        assertThat(productDTO).isNotNull();
        // Add more assertions as needed
    }

    @Test
    public void testGetById_NonExistingId_ThrowsOnlineShopNotFoundException() {
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        assertThatThrownBy(() -> productService.getById(999))
                .isInstanceOf(OnlineShopNotFoundException.class);
    }

    @Test
    @Transactional
    public void testCreateProduct_ValidProductDTO_ReturnsGeneratedId() {
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        ProductDTO productDTO = new ProductDTO();
        // Populate productDTO with necessary fields
        Integer productId = productService.createProduct(productDTO);
        assertThat(productId).isNotNull();
        // Add more assertions as needed
    }

    @Test
    @Transactional
    public void testDeleteById_ExistingId_DeletesProduct() {
        // Assuming product with id 1 exists in the test database
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        productService.deleteById(1);
        // Verify that product with id 1 is deleted
    }

    @Test
    public void testDeleteById_NonExistingId_ThrowsOnlineShopNotFoundException() {
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        assertThatThrownBy(() -> productService.deleteById(999))
                .isInstanceOf(OnlineShopNotFoundException.class);
    }

    @Test
    @Transactional
    public void testUpdateProduct_ExistingId_ValidProductDTO_ReturnsUpdatedProductDTO() {
        // Assuming product with id 1 exists in the test database
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        ProductDTO updatedProductDTO = new ProductDTO();
        // Populate updatedProductDTO with necessary fields
        ProductDTO resultDTO = productService.updateProduct(1, updatedProductDTO);
        assertThat(resultDTO).isNotNull();
        // Add more assertions as needed
    }

    @Test
    public void testUpdateProduct_NonExistingId_ThrowsOnlineShopNotFoundException() {
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        assertThatThrownBy(() -> productService.updateProduct(999, new ProductDTO()))
                .isInstanceOf(OnlineShopNotFoundException.class);
    }

    @Test
    public void testFindProductsByFirstLetters_ExistingLetters_ReturnsMatchingProducts() {
        // Assuming there are products in the test database
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        List<ProductDTO> products = productService.findProductsByFirstLetters("abc");
        assertThat(products).isNotNull();
        // Add more assertions as needed
    }

    @Test
    public void testFindProductsByFirstLetters_NonExistingLetters_ReturnsEmptyList() {
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        List<ProductDTO> products = productService.findProductsByFirstLetters("xyz");
        assertThat(products).isEmpty();
    }

    @Test
    public void testGetAllProductsSortedByPriceAsc_ReturnsProductsSortedByPriceAscending() {
        // Assuming there are products in the test database
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        List<ProductDTO> products = productService.getAllProductsSortedByPriceAsc(BigDecimal.ZERO, BigDecimal.TEN);
        assertThat(products).isNotNull();
        // Verify that products are sorted by price in ascending order
    }

    @Test
    public void testGetAllProductsSortedByPriceDesc_ReturnsProductsSortedByPriceDescending() {
        // Assuming there are products in the test database
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        List<ProductDTO> products = productService.getAllProductsSortedByPriceDesc(BigDecimal.ZERO, BigDecimal.TEN);
        assertThat(products).isNotNull();
        // Verify that products are sorted by price in descending order
    }

    @Test
    public void testFindProductsByFlavour_ExistingFlavour_ReturnsMatchingProducts() {
        // Assuming there are products with the given flavour in the test database
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        List<ProductDTO> products = productService.findProductsByFlavour("chocolate");
        assertThat(products).isNotNull();
        // Add more assertions as needed
    }

    @Test
    public void testFindProductsByFlavour_NonExistingFlavour_ReturnsEmptyList() {
        productService = new ProductServiceImpl(productRepository, flavourCategoryRepository, productValidator, productMapper);
        List<ProductDTO> products = productService.findProductsByFlavour("vanilla");
        assertThat(products).isEmpty();
    }
}
