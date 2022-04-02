package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List getCars(int quantity) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, 22151, "bmv"));
        cars.add(new Car(2, 52153, "dodge"));
        cars.add(new Car(3, 62613, "mercedes"));
        cars.add(new Car(4, 31253, "mazda"));
        cars.add(new Car(5, 78513, "lada"));

        return cars.stream().limit(quantity).toList();
    }
}
