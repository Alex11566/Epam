public class Car {

    private int id;
    private String model;
    private  Brand brand;
    private int yearOfProduced;
    private Color color;
    private int price;
    private String stateNumber;

    public Car(int id, String model, Brand brand, int yearOfProduced, Color color, int price, String stateNumber) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.yearOfProduced = yearOfProduced;
        this.color = color;
        this.price = price;
        this.stateNumber = stateNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getYearOfProduced() {
        return yearOfProduced;
    }

    public void setYearOfProduced(int yearOfProduced) {
        this.yearOfProduced = yearOfProduced;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        stateNumber = stateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Модель='" + model + '\'' +
                ", Брэнд=" + brand +
                ", Год Выпуска=" + yearOfProduced +
                ", Цвет=" + color +
                ", Цена=" + price +
                ", Гос Номер='" + stateNumber + '\'' +
                '}';
    }
}
