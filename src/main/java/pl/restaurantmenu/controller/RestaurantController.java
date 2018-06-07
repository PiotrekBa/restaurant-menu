package pl.restaurantmenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.restaurantmenu.entity.Restaurant;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @GetMapping
    public String showAll(Model model) {
        return "restaurants";
    }

    @GetMapping("/form-restaurant")
    public String addForm() {
        return "form-restaurant";
    }

    @PostMapping("/form-restaurant")
    public String add(Restaurant restaurant) {
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String showDetails(@PathVariable long id, Model model) {
        return "restaurant-details";
    }
}
