package ru.example.todolist.service;

import ru.example.todolist.model.user.CreateUserRq;

public interface UserService {

    /**
     * Добавление нового пользователя
     *
     * @param userRq данные пользователя
     * @return идентификатор пользователя
     */
    Integer create(CreateUserRq userRq);
}
