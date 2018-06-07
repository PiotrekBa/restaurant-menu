package pl.restaurantmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.restaurantmenu.entity.User;
import pl.restaurantmenu.repository.UserRepository;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @GetMapping("/signup")
    public String signUp(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }

    @PostMapping("/signup")
    public String submitSignIn(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "signup";
        }
        userRepo.save(user);
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
