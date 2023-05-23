package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {


    public static List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "q", "a"));
        cars.add(new Car(2, "w", "b"));
        cars.add(new Car(3, "r", "c"));
        cars.add(new Car(4, "t", "d"));
        cars.add(new Car(5, "y", "e"));
    }
    @Override
    public List<Car> getCars(List<Car> car, Integer count) {
        return (count >= 5) ? car : car.subList(0, count);
    }

}


