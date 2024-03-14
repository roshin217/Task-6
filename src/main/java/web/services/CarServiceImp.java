package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService {
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Toyota", "Toyota Corolla", 150));
        cars.add(new Car("BMW", "BMW 3", 90));
        cars.add(new Car("Ford", "Ford Mustang", 4));
        cars.add(new Car("Mercedes-Benz", "Mercedes-Benz E-Class", 210));
        cars.add(new Car("Mercedes-Benz", "Mercedes-Benz S-Class", 320));
    }
    @Override
    public List<Car> getListCars() {
        return cars;
    }
    @Override
    public List<Car> getCountCars(List<Car> cars, Optional<Integer> count) {
        return count.map(integer -> cars.stream().limit(integer).toList()).orElse(cars);
    }
}
