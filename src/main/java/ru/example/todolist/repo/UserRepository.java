package ru.example.todolist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.todolist.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
