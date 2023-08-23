package ru.example.todolist.model.user;

/**
 * Запрос на создание нового пользователя
 */
public class CreateUserRq {

    /**
     * Логин пользователя
     */
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
