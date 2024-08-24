package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars = Arrays.asList(
            new Car("Audi", 10_000, 1990),
            new Car("BMW", 15_000, 2000),
            new Car("Mercedes", 20_000, 2005),
            new Car("Toyota", 25_000, 2015),
            new Car("Lexus", 30_000, 2020));

    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
