package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarShopTest {

    CarShop carShop = new CarShop("Best Car", 10_000_000);

    Car car1;
    Car car2;
    Car car3;
    Car car4;

    @BeforeEach
    void initCarShop() {
        car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
        carShop.addCar(car1);
        car1.decreasePrice(10);
        carShop.addCar(car3);
        carShop.addCar(car4);
    }

    @Test
    void createCarShopTest() {
        CarShop carShop1 = new CarShop("Best Car", 10_000_000);
                assertEquals("Best Car", carShop1.getName());
                assertEquals(10_000_000, carShop1.getMaxPrice());
    }

    @Test
    void addCarTest() {
        assertTrue(carShop.addCar(car1));
        assertFalse(carShop.addCar(car2));
        assertEquals(4, carShop.getCarsForSell().size());
    }

    @Test
    void sumCarPriceTest() {
        assertEquals(6270000, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThanTest() {
        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));
        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void carsWithBrandTest() {
        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("Lamborghini").size());
    }
}
