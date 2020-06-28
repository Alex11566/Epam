import CarBuid.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> car = Arrays.asList(
                new ComfortClass(Brand.VOLKSWAGEN, Model.TIGUAN, Color.RED, 2016, 1900_000, 13, 500),
                new ComfortClass(Brand.SKODA, Model.KODIAQ, Color.WHITE, 2015, 2_000_000, 15, 600),
                new StandartClass(Brand.KIA, Model.RIO, Color.SILVER, 2013, 900_000, 10, 300),
                new StandartClass(Brand.HYUNDAI, Model.SOLARIS, Color.SILVER, 2014, 1_000_000, 11, 400),
                new PremiumClass(Brand.MERCEDES, Model.MAYBACH, Color.BLACK, 2019, 3_000_000, 16, 900),
                new PremiumClass(Brand.KIA, Model.STINGER, Color.RED, 2020, 2_850_000, 18, 800));
        Taxi taxi = new Taxi(car);
        System.out.println(Taxi.priceOfTaxi(car));
        Collections.sort(car, (o1, o2) -> {
            if (o1.getPrice() > o2.getPrice())
                return 1;
            else if (o1.getPrice() < o2.getPrice())
                return -1;
            else return 0;
        });
        for (Car cars : car) {
            System.out.println(cars);

        }
    }
}





