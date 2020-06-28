package CarBuid;

public class StandartClass extends Car {
    private Model model;
    private int priceOfRide ;
    private final int maxPeopleInCar = 3;

    public StandartClass(Brand brand, Model model, Color color, int yearOfProduced, int price, int fuelConsumption,  int priceOfRide) {
        super(brand, color, yearOfProduced, price, fuelConsumption);
        this.model = model;
        this.priceOfRide = priceOfRide;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getPriceOfRide() {
        return priceOfRide;
    }

    public void setPriceOfRide(int priceOfRide) {
        this.priceOfRide = priceOfRide;
    }

    public int getMaxPeopleInCar() {
        return maxPeopleInCar;
    }
}
