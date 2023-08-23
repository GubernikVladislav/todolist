package ru.example.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.todolist.entity.User;
import ru.example.todolist.model.user.CreateUserRq;
import ru.example.todolist.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Integer create(CreateUserRq userRq) {
        User user = new User();
        user.setLogin(userRq.getLogin());

        return userRepository.save(user).getId();
    }
}
