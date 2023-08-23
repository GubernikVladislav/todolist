package ru.example.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.todolist.model.user.CreateUserRq;
import ru.example.todolist.model.user.CreateUserRs;
import ru.example.todolist.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public CreateUserRs create(@RequestBody CreateUserRq userRq) {
        return new CreateUserRs(userService.create(userRq));
    }
}
