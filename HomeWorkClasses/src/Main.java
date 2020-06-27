import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "Ceed", Brand.KIA, 2015, Color.WHITE, 21000, "M532BM"));
        cars.add(new Car(2, "Creta", Brand.HYUNDAI, 2016, Color.SILVER, 20000, "O454CM"));
        cars.add(new Car(3, "LX300", Brand.LEXUS, 2010, Color.BLACK, 15000, "C235CC"));
        cars.add(new Car(4, "Seltos", Brand.KIA, 2020, Color.WHITE, 30000, "X222XX"));
        cars.add(new Car(5, "Corolla", Brand.TOYOTA, 2008, Color.ORANGE, 10000, "M523CB"));
       /* for (Car car: cars
        ) {
            System.out.println(car);
        }*/
        CarsSelection carsSelection = new CarsSelection();
        List<Car> carByBrand = carsSelection.carsByBrand(cars, Brand.KIA);
        for (Car car : carByBrand) {
            System.out.println(car);
        }
        System.out.println("________________________________________________________________");

        List<Car> carByModelAndYearOfProd = carsSelection.carByModelAndYearOfProduced(cars, "LX300", 3);
        for (Car car : carByModelAndYearOfProd) {
            System.out.println(car);

        }

        System.out.println("________________________________________________________________");

        List<Car> carByYearAndPrice = carsSelection.carByYearOfProdAndPrice(cars, 2016, 10000);
        for (Car car : carByYearAndPrice) {
            System.out.println(car);


        }
    }
}
