package com.example.todoapp.services;

import com.example.todoapp.models.TodoItem;
import com.example.todoapp.repos.TodoItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepo todoItemRepo;

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepo.findById(id);
    }

    public Iterable<TodoItem> getAll() {
        return todoItemRepo.findAll();
    }

    public TodoItem save(TodoItem todoItem) {
        if (todoItem.getId() == null) {
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoItemRepo.save(todoItem);
    }

    public void delete(TodoItem todoItem) {
        todoItemRepo.delete(todoItem);
    }

}