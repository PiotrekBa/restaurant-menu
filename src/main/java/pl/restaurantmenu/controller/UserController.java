package pl.restaurantmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.restaurantmenu.entity.User;
import pl.restaurantmenu.repository.RepositoryTest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RepositoryTest repositoryTest;

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
        User savedUser = repositoryTest.getUser();
        String userName = savedUser.getUserName();
        String userPassword = savedUser.getPassword();
        if(user.getUserName().equals(userName)) {
            if(user.getPassword().equals(userPassword)) {

            }
        }
        return "user-profile";
    }
}
