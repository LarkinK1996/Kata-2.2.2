package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(defaultValue = "5",value = "count", required = false) int quantity, ModelMap model) {

        CarService carService = new CarService();

        List<Car> cars = carService.getCars(quantity);

        model.addAttribute("cars", cars);
        return "cars";
    }
}