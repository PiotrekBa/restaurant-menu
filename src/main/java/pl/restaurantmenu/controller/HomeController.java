package pl.restaurantmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.restaurantmenu.repository.RestaurantRepository;

@Controller
public class HomeController {

    @Autowired
    RestaurantRepository restaurantRepo;

    @GetMapping("/")
    public String home(Model model) {
        long restaurantsAmount = restaurantRepo.count();
        model.addAttribute("amount", restaurantsAmount);
        return "home";
    }
}
