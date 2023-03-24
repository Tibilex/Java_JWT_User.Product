package com.example.JWT.Controllers;

import com.example.JWT.Models.User;
import com.example.JWT.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping(path = "/register")
    public @ResponseBody String registerNewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setPassword(email);
        userRepo.save(user);
        return String.format("User %1$s is registered.", name);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }
}
