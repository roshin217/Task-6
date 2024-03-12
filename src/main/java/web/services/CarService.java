package web.services;
import web.models.Car;
import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getListCars();
    List<Car> getCountCars(List<Car> cars, Optional<Integer> count);
}
