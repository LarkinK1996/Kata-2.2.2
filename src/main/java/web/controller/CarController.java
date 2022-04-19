package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(defaultValue = "5",value = "count", required = false) int quantity, ModelMap model) {

        CarServiceImpl carService = new CarServiceImpl();

        List<Car> cars = carService.getCars(quantity);

        model.addAttribute("cars", cars);
        return "cars";
    }
}