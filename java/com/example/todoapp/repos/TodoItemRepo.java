package com.example.todoapp.repos;

import com.example.todoapp.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepo extends JpaRepository<TodoItem, Long> {
}
