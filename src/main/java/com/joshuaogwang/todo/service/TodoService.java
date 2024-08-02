package com.joshuaogwang.todo.service;

import com.joshuaogwang.todo.model.Todo;
import com.joshuaogwang.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo addTodo(Todo todo) {
        return this.todoRepository.save(todo);
    }

    public List<Todo> todos() {
        return this.todoRepository.findAll();
    }

    public Optional<Todo> todo(Long id) {
        return this.todoRepository.findById(id);
    }

    public Todo editTodo(Todo todo, Long id) {
        Todo todo1 = todoRepository.findById(id).orElseThrow();
        todo1.setTitle(todo.getTitle());
        todo1.setDescription(todo.getTitle());
        todo1.setStartDate(todo.getStartDate());
        todo1.setEndDate(todo.getEndDate());
        todo1.setStatus(todo.getStatus());
        return todoRepository.save(todo1);
    }

    public Integer deleteTodo(Long id) {
        todoRepository.deleteById(id);
        return 1;
    }
}
