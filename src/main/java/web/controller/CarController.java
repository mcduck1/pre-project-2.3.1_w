package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.model.CarService;
import web.model.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

@ComponentScan
@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.carsCount(count));
        return "cars";
    }


}
