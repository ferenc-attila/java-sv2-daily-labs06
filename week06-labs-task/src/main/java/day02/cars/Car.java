package day02.cars;

public class Car {

    private final String brand;
    private final double cylinderCapacity;
    private Color color;
    private int price;

    public Car(String brand, double cylinderCapacity, Color color, int price) {
        this.brand = brand;
        this.cylinderCapacity = cylinderCapacity;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int discount) {
        price *= (100 - discount) / 100d;
    }

    public String getBrand() {
        return brand;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public Color getColor() {
        return color;
    }

    public long getPrice() {
        return price;
    }
}
