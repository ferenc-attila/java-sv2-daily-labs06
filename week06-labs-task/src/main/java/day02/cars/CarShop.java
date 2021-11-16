package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private final String name;
    private int maxPrice;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice() {
        int sumCarPrice = 0;
        for (Car car : cars) {
            sumCarPrice += car.getPrice();
        }
        return sumCarPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCarsCheaperThan = 0;
        for (Car car : cars) {
            if (car.getPrice() <= price) {
                numberOfCarsCheaperThan++;
            }
        }
        return numberOfCarsCheaperThan;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsWithBrand = new ArrayList<>();
        for (Car car : cars) {
            if (brand.equals(car.getBrand())) {
                carsWithBrand.add(car);
            }
        }
        return carsWithBrand;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }
}
