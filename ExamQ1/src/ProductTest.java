import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
    };

    int[][] sales = {
            {25, 10, 20},
            {15, 10, 12},
            {18, 15, 20}
    };

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(productNames, sales);

        int result = product.GetTotalProductsSold();

        assertEquals(145, result);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(productNames, sales);

        double result = product.GetAverageProductSold();

        assertEquals(145.0 / 9.0, result, 0.001);
    }
}

