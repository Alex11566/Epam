import CarBuid.*;

import java.util.*;

public class Taxi {
    private List<Car> car;
    private Object Car;

    public Taxi(List<Car> car) {

    }

    public static int priceOfTaxi(List<Car> cars) {

        int finalPrice = 0;
        for (Car car :cars){
        finalPrice+=car.getPrice();

        }
        return finalPrice;
    }

    public Taxi sortByFuelConsuption(){

    Collections.sort(List, (o1, o2) -> {
         if(o1.getPrice() > o2.getPrice())
             return 1;
         else if (o1.getPrice()< o2.getPrice())
             return -1;
         else return 0;
     });
    return  this;

    }


}



