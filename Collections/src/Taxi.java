import CarBuid.*;

import java.util.*;

public class Taxi {
    private List<? extends  Car> cars;


    public Taxi(List<Car> car) {

    }

    public static int priceOfTaxi(List<Car> cars) {

        int finalPrice = 0;
        for (Car car :cars){
        finalPrice+=car.getPrice();

        }
        return finalPrice;
    }

    public Taxi sortByPrice(List<Car> cars){

    cars.sort((o1, o2) -> {
        if (o1.getPrice() > o2.getPrice())
            return 1;
        else if (o1.getPrice() < o2.getPrice())
            return -1;
        else return 0;
    });
    return  this;

    }

    public void sortByYearOfProd(List<Car> cars, int beginOfProd, int endOfProd){
        List<Car> result = new ArrayList<>();
        for (Car car : cars){
            if(car.getYearOfProduced() >= beginOfProd && car.getYearOfProduced() <= endOfProd){
                result.add(car);
            }
        }
        for (Car car : result) {
            System.out.println(car);

            }
    }



}



