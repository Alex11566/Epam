package CarBuid;

public class Car {
    private Brand brand;
    private Color color;
    private int yearOfProduced;
    private int price;
    private int fuelConsumption;

    public Car(Brand brand, Color color, int yearOfProduced, int price, int fuelConsumption) {
        this.brand = brand;
        this.color = color;
        this.yearOfProduced = yearOfProduced;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", yearOfProduced=" + yearOfProduced +
                ", price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYearOfProduced() {
        return yearOfProduced;
    }

    public void setYearOfProduced(int yearOfProduced) {
        this.yearOfProduced = yearOfProduced;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

}

