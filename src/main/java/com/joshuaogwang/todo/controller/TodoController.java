package com.joshuaogwang.todo.controller;

import com.joshuaogwang.todo.model.Todo;
import com.joshuaogwang.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping(path = "/todo")
    public Todo saveTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @GetMapping(path = "/todo")
    public List<Todo> saveTodo() {
        return todoService.todos();
    }

    @GetMapping(path = "/todo/{id}")
    public Optional<Todo> saveTodo(@PathVariable Long id) {
        return todoService.todo(id);
    }

    @PutMapping(path = "/todo/{id}")
    public Todo editTodo(@RequestBody Todo todo, @PathVariable Long id) {
        return todoService.editTodo(todo, id);
    }

    @DeleteMapping(path = "/todo/{id}")
    public Integer deleteTodo(@PathVariable Long id) {
        return todoService.deleteTodo(id);
    }
}
