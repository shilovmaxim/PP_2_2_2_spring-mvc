package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/car_service")
public class CarController {

    @Autowired
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = {"/cars", "/cars2"})
    public String carPage(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count != null) model.addAttribute("cars", carService.getListCars(count));
        return "/car_service/cars";
    }

}
