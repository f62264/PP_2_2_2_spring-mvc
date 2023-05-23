package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarServiceImpl carServiceImpl) {
        this.carService = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.getCars(CarServiceImpl.cars, count));
        return "cars";
    }

}
