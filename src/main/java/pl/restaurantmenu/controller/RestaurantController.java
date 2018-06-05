package pl.restaurantmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.restaurantmenu.entity.Restaurant;
import pl.restaurantmenu.repository.RepositoryTest;

import java.util.List;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RepositoryTest repositoryTest;

    @GetMapping
    public String getRestaurants(Model model) {
        List<Restaurant> restaurantList = repositoryTest.getData();
        model.addAttribute("restaurants", restaurantList);
        return "restaurants";
    }

}
