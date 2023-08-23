package ru.example.todolist.model.user;

/**
 * Ответ на запрос на создание пользователя
 */
public class CreateUserRs {

    /**
     * Идентификатор созданного пользователя
     */
    private final Integer id;

    public CreateUserRs(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
