package pl.restaurantmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.restaurantmenu.entity.Restaurant;
import pl.restaurantmenu.repository.RepositoryTest;

import java.util.List;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

//    @Autowired
//    RepositoryTest repositoryTest;

    @GetMapping
    public String showAll(Model model) {
//        List<Restaurant> restaurantList = repositoryTest.getRestaurants();
//        model.addAttribute("restaurants", restaurantList);
        return "restaurants";
    }

    @GetMapping("/form-restaurant")
    public String addForm() {
        return "form-restaurant";
    }

    @PostMapping("/form-restaurant")
    public String add(Restaurant restaurant) {
//        repositoryTest.add(restaurant);
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String showDetails(@PathVariable long id, Model model) {
//        Restaurant restaurant = repositoryTest.getById(id);
//        model.addAttribute("restaurant", restaurant);
        return "restaurant-details";
    }
}
