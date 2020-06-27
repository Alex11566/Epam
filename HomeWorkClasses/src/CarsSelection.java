import java.util.ArrayList;
import java.util.List;

public class CarsSelection {
    public List<Car> carsByBrand(List<Car> cars, Brand brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand))
                result.add(car);

        }
        return result;
    }

    public List<Car> carByModelAndYearOfProduced(List<Car> cars, String model, int carUsed) {

         List<Car> result1 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model) && 2020 - car.getYearOfProduced() > carUsed) {
                result1.add(car);

            }

        }
        return result1;
    }
    public List<Car> carByYearOfProdAndPrice (List<Car> cars, int yearOfProd, int price){
       List<Car> result2 = new ArrayList<>();
        for (Car car: cars) {
            if(car.getYearOfProduced()==yearOfProd && car.getPrice() > price){
                result2.add(car);

            }

        }
        return result2;
    }
}




