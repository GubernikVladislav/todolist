package ru.example.todolist.model.todo;

/**
 * Запрос на добавления события в todo-лист пользователя
 */
public class AddEventRq {

    /**
     * Идентификатор пользователя
     */
    private Integer userId;

    /**
     * Заголовок события
     */
    private String title;

    /**
     * Описание события
     */
    private String description;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
