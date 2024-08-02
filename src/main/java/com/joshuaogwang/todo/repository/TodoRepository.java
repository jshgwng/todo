package com.joshuaogwang.todo.repository;

import com.joshuaogwang.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
