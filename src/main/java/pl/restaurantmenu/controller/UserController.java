package pl.restaurantmenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.restaurantmenu.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public String addForm() {
        return "add-user";
    }

    @PostMapping("/add")
    public String add(User user) {
        return "redirect:/";
    }

    @GetMapping("/profile")
    public String profile() {
        return "user-profile";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "user-login";
    }

    @PostMapping("/login")
    public String login(User user) {
        return "user-profile";
    }
}
