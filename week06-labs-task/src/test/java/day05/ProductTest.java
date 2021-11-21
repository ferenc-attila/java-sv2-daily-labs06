package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product = new Product("Chicken breast", Type.MEAT, 3.3);

    @Test
    void getName() {
        assertEquals("Chicken breast", product.getName());
    }

    @Test
    void getType() {
        assertEquals(Type.MEAT, product.getType());
    }

    @Test
    void getPrice() {
        assertEquals(3.3, product.getPrice(), 0.0005);
    }
}