package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);

    @Test
    void createCarTest(){
        Car car = new Car("Renault", 1.2, Color.BLACK, 2_300_000);

        assertEquals("Renault", car.getBrand());
        assertEquals(1.2, car.getCylinderCapacity());
        assertEquals(Color.BLACK, car.getColor());
        assertEquals(2_300_000, car.getPrice());
    }

    @Test
    void decreasePriceTest() {
        car1.decreasePrice(10);
        assertEquals(2070000, car1.getPrice());
    }
}
