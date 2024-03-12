package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarServiceImp;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    private final CarServiceImp carServiceImp;
    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }
    @GetMapping("/cars")
    public String getCars(@RequestParam("count") Optional<Integer> count, ModelMap module) {

        List<Car> cars = carServiceImp.getListCars();
        module.addAttribute("cars", carServiceImp.getCountCars(cars, count));

        return "cars";
    }
}
