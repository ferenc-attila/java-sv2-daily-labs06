package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {

    Store store = new Store();
    Store anotherStore = new Store();

    @BeforeEach
    void init() {
        store.addProduct(new Product("bread", Type.BAKERY, 0.7));
        store.addProduct(new Product("apple", Type.FRUIT, 0.5));
        store.addProduct(new Product("pear", Type.FRUIT, 1));
        store.addProduct(new Product("melon", Type.FRUIT, 3));
        store.addProduct(new Product("bean", Type.VEGETABLE, 0.8));
    }

    @Test
    void addProductTest() {
        anotherStore.addProduct(new Product("Sour Cream", Type.DIARY, 0.9));
        assertEquals(1, anotherStore.getProducts().size());
        assertEquals(Type.DIARY, anotherStore.getProducts().get(0).getType());
        assertEquals("Sour Cream", anotherStore.getProducts().get(0).getName());
        assertEquals(0.9, anotherStore.getProducts().get(0).getPrice());
    }

    @Test
    void numberOfProductsByOneTypeTest() {
        anotherStore.addProduct(new Product("Sour Cream", Type.DIARY, 0.9));
        List<ProductWithPiece> result = anotherStore.numberOfProductsByType();
        assertEquals(1, result.size());
        assertEquals(Type.DIARY, result.get(0).getType());
    }

    @Test
    void numberOfProductsByTypeTest() {
        List<ProductWithPiece> result = store.numberOfProductsByType();
        assertEquals(3, result.size());
        assertEquals(Type.BAKERY, result.get(0).getType());
        assertEquals(Type.VEGETABLE, result.get(2).getType());
    }
}